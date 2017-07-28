package com.xendit.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sergey on 3/16/17.
 */

public class Token {

    private String id;
    private String status;
    private Authentication authentication;

    public Token(Authentication authentication) {
        this.id = authentication.getId();
        this.status = authentication.getStatus();
        this.authentication = authentication;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    @Deprecated
    public Authentication getAuthentication() {
        return authentication;
    }
}