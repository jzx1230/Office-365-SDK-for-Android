package com.microsoft.office365.odata;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.microsoft.office365.odata.interfaces.DependencyResolver;
import com.microsoft.office365.odata.interfaces.HttpVerb;

public abstract class ODataEntityQuery<E> extends ODataExecutable implements Executable<E> {

    private String urlComponent;
    private ODataExecutable parent;
    private Class<E> clazz;

    public ODataEntityQuery(String urlComponent, ODataExecutable parent, Class<E> clazz) {
        this.urlComponent = urlComponent;
        this.parent = parent;
        this.clazz = clazz;
    }

    @Override
    ListenableFuture<byte[]> oDataExecute(String path, byte[] content, HttpVerb verb) {
        StringBuilder url = new StringBuilder();
        if (urlComponent.length() > 0) {
            url.append(urlComponent);
        }

        if (path.length() > 0) {
            url.append("/");
            url.append(path);
        }

        return parent.oDataExecute(url.toString(), content, verb);
    }

    @Override
    DependencyResolver getResolver() {
        return parent.getResolver();
    }

    public ListenableFuture<E> update(E updatedEntity) {
        final SettableFuture<E> result = SettableFuture.create();

        String payload = getResolver().getJsonSerializer().serialize(updatedEntity);

        ListenableFuture<byte[]> future = oDataExecute("", payload.getBytes(Constants.UTF8), HttpVerb.PATCH);

        Futures.addCallback(future, new FutureCallback<byte[]>() {
            @Override
            public void onSuccess(byte[] payload) {
                try {
                    String string = new String(payload, Constants.UTF8_NAME);
                    DependencyResolver resolver = getResolver();
                    E entity = resolver.getJsonSerializer().deserialize(string, clazz);
                    result.set(entity);
                } catch (Throwable e) {
                    result.setException(e);
                }
            }

            @Override
            public void onFailure(Throwable throwable) {
                result.setException(throwable);
            }
        });

        return result;
    }

    public ListenableFuture delete() {
        final SettableFuture<E> result = SettableFuture.create();

        ListenableFuture<byte[]> future = oDataExecute("", null, HttpVerb.DELETE);

        Futures.addCallback(future, new FutureCallback<byte[]>() {
            @Override
            public void onSuccess(byte[] payload) {
                result.set(null);
            }

            @Override
            public void onFailure(Throwable throwable) {
                result.setException(throwable);
            }
        });

        return result;
    }

    public ListenableFuture<E> execute() {
        final SettableFuture<E> result = SettableFuture.create();

        ListenableFuture<byte[]> future = oDataExecute("", null, HttpVerb.GET);
        Futures.addCallback(future, new FutureCallback<byte[]>() {
            @Override
            public void onSuccess(byte[] payload) {
                try {
                    String string = new String(payload, Constants.UTF8_NAME);
                    E entity = getResolver().getJsonSerializer().deserialize(string, clazz);

                    result.set(entity);
                } catch (Throwable t) {
                    result.setException(t);
                }
            }

            @Override
            public void onFailure(Throwable throwable) {
                result.setException(throwable);
            }
        });

        return result;
    }
}