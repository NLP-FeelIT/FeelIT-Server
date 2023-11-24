package com.example.feelit.controller;

import com.example.feelit.dto.AiResponse;
import com.example.feelit.dto.RequestDto;
import com.example.feelit.global.ApiResponse;
import com.example.feelit.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AppController {
    private final AppService appService;

    @GetMapping("/") // 테스팅
    public String hello() {
        return "Hello, FeelIt!";
    }
//    @PostMapping("/analyzeTest") // POST /analyze로 요청이 들어오면 inputText를 받아 분석 결과를 반환
//    public ApiResponse<AiResponse.AiDto> testAnalyze(
//            @RequestBody RequestDto requestDto
//    ) {
//        return ApiResponse.success(appService.sampleResults(requestDto));
//    }

    @PostMapping("/analyze") // POST /analyze로 요청이 들어오면 inputText를 받아 분석 결과를 반환
    public ApiResponse<AiResponse.AiDto> textAnalyze(
            @RequestBody RequestDto requestDto
    ) {
        return ApiResponse.success(appService.getResults(requestDto));
    }
}
