package com.example.feelit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class AiResponse { //AI 응답 양식 지정

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AiDto{
        String analysisResult;
    }
}
