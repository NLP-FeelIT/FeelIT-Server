package com.example.feelit.dto;

import lombok.*;

public class AiResponse { //AI 응답 양식 지정

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AiDto{
        String inputText;
        String analysisResult;
    }
}
