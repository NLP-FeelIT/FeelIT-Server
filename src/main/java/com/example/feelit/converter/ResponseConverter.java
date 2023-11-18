package com.example.feelit.converter;

import com.example.feelit.dto.AiResponse;

public class ResponseConverter {

    public static AiResponse.AiDto toAiDTO(String inputText, String analysisResult){
        return AiResponse.AiDto.builder()
                .inputText(inputText)
                .analysisResult(analysisResult)
                .build();
    }
}
