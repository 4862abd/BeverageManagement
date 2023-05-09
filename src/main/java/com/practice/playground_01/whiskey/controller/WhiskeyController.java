package com.practice.playground_01.whiskey.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
//@RequestMapping("{apiPrefix}/whiskey")
@RequestMapping("/whiskey")
public class WhiskeyController {

    @GetMapping
    public ResponseEntity<Integer> findAll() {
        return ResponseEntity.ok(1);
    }
}
