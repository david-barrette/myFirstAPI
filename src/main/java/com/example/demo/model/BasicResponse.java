package com.example.demo.model;

import com.example.demo.util.TimeUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BasicResponse {
    @JsonProperty
    private String timestamp;
    @JsonProperty
    private String message;

    public BasicResponse(){
        this("This is a placeholder String!!! Try putting '/hello?name=<your name>' in the URL!");
    }
    public BasicResponse(String message){
        this.message = message;
        this.timestamp = TimeUtil.getCurrentTime();
    }

}
