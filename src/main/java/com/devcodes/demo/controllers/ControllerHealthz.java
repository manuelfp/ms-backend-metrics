package com.devcodes.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/healthz")
public class ControllerHealthz {

    @RequestMapping
    public String getHealthz() {
        return "OK";
    }

}
