package com.boyutyazilim.turkiyeoku.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/")
public class RestController {

    @GetMapping
    public ResponseEntity<String> getList(){
        return ResponseEntity.ok("Hello Work");
    }

    @GetMapping("{name}")
    public ResponseEntity<String> getList(@PathVariable String name){
        return ResponseEntity.ok("Hello Work" + name);
    }
}
