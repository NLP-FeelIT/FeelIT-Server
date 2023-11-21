package com.example.feelit.dto;

import lombok.*;
@Getter
public class AiResponse { //AI 응답 양식 지정
    private AiDto data;

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AiDto{
        String inputText;
        double fear;
        double surprised;
        double anger;
        double sad;
        double neutral;
        double happy;
        double disgust;
    }
}
