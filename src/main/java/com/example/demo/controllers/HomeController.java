package com.example.demo.controllers;


import com.example.demo.model.BasicResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public ResponseEntity noPath(){
        log.info(String.format("You hit this endpoint %s", "\'/\'"));

        BasicResponse basicResponse = new BasicResponse();
        ResponseEntity response = new ResponseEntity(new BasicResponse(), HttpStatus.OK);
        return response;
    }

}
