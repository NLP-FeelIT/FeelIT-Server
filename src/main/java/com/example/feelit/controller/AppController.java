package com.example.feelit.controller;

import com.example.feelit.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AppController {
    private final AppService appService;

    @PostMapping("/analyze")
    public ResponseEntity<String> textAnalyze(
            @RequestBody String inputText
    ) {
        return new ResponseEntity<>(appService.getResults(inputText), HttpStatus.OK);
    }
}
