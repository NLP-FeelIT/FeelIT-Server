package com.example.feelit.converter;

import com.example.feelit.dto.AiResponse;

public class ResponseConverter {

    public static AiResponse.AiDto toAiDTO(String inputText){
        return AiResponse.AiDto.builder()
                .inputText(inputText)
                .fear(0.1)
                .surprised(0.2)
                .anger(0.15)
                .sad(0.05)
                .neutral(0.2)
                .happy(0.1)
                .disgust(0.2)
                .build();
    }
}
