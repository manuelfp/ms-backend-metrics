package com.devcodes.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/v1/api/healthz")
public class ControllerHealthz {

    @RequestMapping
    public ResponseEntity<Object> getHealthz() {
        Map<String, String> healthz = new HashMap<>();
        healthz.put("Status", "OK");
        return ResponseEntity.ok(healthz);
    }

    @RequestMapping("/demo")
    public ResponseEntity<Object> getDemo() {
        Map<String, String> demo = new HashMap<>();
        demo.put("Demo", "All OK");
        return ResponseEntity.ok(demo);
    }

}
