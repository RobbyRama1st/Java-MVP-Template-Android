package com.sweet.cloves.javamvptemplateandroid.data.remote.response;

import com.google.gson.annotations.SerializedName;

public class BaseResponse {

    @SerializedName("error")
    private boolean error;
    @SerializedName("status_code")
    private int statusCode;
    @SerializedName("message")
    private String message;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
