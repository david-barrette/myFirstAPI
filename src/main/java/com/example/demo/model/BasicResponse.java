package com.example.demo.model;

import com.example.demo.model.constants.messageList;
import com.example.demo.util.TimeUtil;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BasicResponse {
    @JsonProperty
    private String timestamp;
    @JsonProperty
    private String message;

    public BasicResponse(){
        this(messageList.Messages.DEFAULT_MESSAGE.toString());
    }
    public BasicResponse(String message){
        this.message = message;
        this.timestamp = TimeUtil.getCurrentTime();
    }

}
