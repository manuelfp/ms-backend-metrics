package com.devcodes.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/healthz")
public class ControllerHealthz {

    @RequestMapping
    public ResponseEntity<String> getHealthz() {
        return ResponseEntity.ok("OK");
    }

    @RequestMapping("/demo")
    public ResponseEntity<String> getDemo() {
        return ResponseEntity.ok("Demo");
    }

}
