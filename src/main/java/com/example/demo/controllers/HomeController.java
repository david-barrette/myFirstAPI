package com.example.demo.controllers;


import com.example.demo.model.BasicResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public ResponseEntity noPath(){
        log.info(String.format("You hit this endpoint %s", "\'/\'"));

        ResponseEntity response = new ResponseEntity(new BasicResponse(), HttpStatus.OK);
        return response;
    }

    @GetMapping("/hello")
    public ResponseEntity hello(@RequestParam(name = "name") String name){
        log.info(String.format("%s hit the \"hello\" endpoint through the RequestParameter!", name));
        String message = "Hello " + name + "! Welcome to my API! Hope you don't expect much because this is all you can do for now!";

        ResponseEntity response = new ResponseEntity(new BasicResponse(message), HttpStatus.OK);
        return response;
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity testHello(@PathVariable String name){
        log.info(String.format("%s hit the \"hello\" endpoint through the PathVariable!", name));
        String message = "Hello " + name + "! Wow you found a hidden endpoint, well done!";

        ResponseEntity response = new ResponseEntity(new BasicResponse(message), HttpStatus.OK);
        return response;
    }



}
