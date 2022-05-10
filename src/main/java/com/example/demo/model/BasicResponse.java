package com.example.demo.model;

import com.example.demo.util.TimeUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BasicResponse {
    @JsonProperty
    private String message;
    @JsonProperty
    private String timestamp;

    public BasicResponse(){
        this("This is a placeholder String!!!");
    }
    public BasicResponse(String message){
        this.message = message;
        this.timestamp = TimeUtil.getCurrentTime();
    }

}
