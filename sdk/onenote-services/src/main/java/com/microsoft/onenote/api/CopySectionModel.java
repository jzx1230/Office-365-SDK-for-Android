/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.onenote.api;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Copy Section Model.
*/
public class CopySectionModel extends ODataBaseEntity {

    public CopySectionModel(){
        setODataType("#Microsoft.OneNote.Api.CopySectionModel");
    }

    private Boolean isDefault;

    /**
    * Gets the is Default.
    *
    * @return the Boolean
    */
    public Boolean getIsDefault() {
        return this.isDefault; 
    }

    /**
    * Sets the is Default.
    *
    * @param value the Boolean
    */
    public void setIsDefault(Boolean value) { 
        this.isDefault = value;
        valueChanged("isDefault", value);

    }

    private String pagesUrl;

    /**
    * Gets the pages Url.
    *
    * @return the String
    */
    public String getPagesUrl() {
        return this.pagesUrl; 
    }

    /**
    * Sets the pages Url.
    *
    * @param value the String
    */
    public void setPagesUrl(String value) { 
        this.pagesUrl = value;
        valueChanged("pagesUrl", value);

    }

    private String name;

    /**
    * Gets the name.
    *
    * @return the String
    */
    public String getName() {
        return this.name; 
    }

    /**
    * Sets the name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.name = value;
        valueChanged("name", value);

    }

    private String createdBy;

    /**
    * Gets the created By.
    *
    * @return the String
    */
    public String getCreatedBy() {
        return this.createdBy; 
    }

    /**
    * Sets the created By.
    *
    * @param value the String
    */
    public void setCreatedBy(String value) { 
        this.createdBy = value;
        valueChanged("createdBy", value);

    }

    private String lastModifiedBy;

    /**
    * Gets the last Modified By.
    *
    * @return the String
    */
    public String getLastModifiedBy() {
        return this.lastModifiedBy; 
    }

    /**
    * Sets the last Modified By.
    *
    * @param value the String
    */
    public void setLastModifiedBy(String value) { 
        this.lastModifiedBy = value;
        valueChanged("lastModifiedBy", value);

    }

    private java.util.Calendar lastModifiedTime;

    /**
    * Gets the last Modified Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastModifiedTime() {
        return this.lastModifiedTime; 
    }

    /**
    * Sets the last Modified Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastModifiedTime(java.util.Calendar value) { 
        this.lastModifiedTime = value;
        valueChanged("lastModifiedTime", value);

    }

    private String id;

    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getId() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setId(String value) { 
        this.id = value;
        valueChanged("id", value);

    }

    private String self;

    /**
    * Gets the self.
    *
    * @return the String
    */
    public String getSelf() {
        return this.self; 
    }

    /**
    * Sets the self.
    *
    * @param value the String
    */
    public void setSelf(String value) { 
        this.self = value;
        valueChanged("self", value);

    }

    private java.util.Calendar createdTime;

    /**
    * Gets the created Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getCreatedTime() {
        return this.createdTime; 
    }

    /**
    * Sets the created Time.
    *
    * @param value the java.util.Calendar
    */
    public void setCreatedTime(java.util.Calendar value) { 
        this.createdTime = value;
        valueChanged("createdTime", value);

    }
}
