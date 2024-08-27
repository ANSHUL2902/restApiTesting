package com.app.bajajTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.bajajTest.model.RequestModel;
import com.app.bajajTest.model.ResponseModel;
import com.app.bajajTest.service.Bfhlservice;

@RestController
public class BfhlController {

    @Autowired
    private Bfhlservice bfhlService;

    @PostMapping("/bfhl")
    public ResponseEntity<ResponseModel> processData(@RequestBody RequestModel request){
        ResponseModel response = bfhlService.processData(request);
        return ResponseEntity.ok(response);
    }
}
