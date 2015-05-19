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

/**
 * The type Patch Content Command.
*/
public class PatchContentCommand extends ODataBaseEntity {

    public PatchContentCommand(){
        setODataType("#Microsoft.OneNote.Api.PatchContentCommand");
    }

    private PatchActionType action;

    /**
    * Gets the action.
    *
    * @return the PatchActionType
    */
    public PatchActionType getaction() {
        return this.action; 
    }

    /**
    * Sets the action.
    *
    * @param value the PatchActionType
    */
    public void setaction(PatchActionType value) { 
        this.action = value; 
    }

    private String target;

    /**
    * Gets the target.
    *
    * @return the String
    */
    public String gettarget() {
        return this.target; 
    }

    /**
    * Sets the target.
    *
    * @param value the String
    */
    public void settarget(String value) { 
        this.target = value; 
    }

    private String content;

    /**
    * Gets the content.
    *
    * @return the String
    */
    public String getcontent() {
        return this.content; 
    }

    /**
    * Sets the content.
    *
    * @param value the String
    */
    public void setcontent(String value) { 
        this.content = value; 
    }

    private PatchInsertPosition position;

    /**
    * Gets the position.
    *
    * @return the PatchInsertPosition
    */
    public PatchInsertPosition getposition() {
        return this.position; 
    }

    /**
    * Sets the position.
    *
    * @param value the PatchInsertPosition
    */
    public void setposition(PatchInsertPosition value) { 
        this.position = value; 
    }
}