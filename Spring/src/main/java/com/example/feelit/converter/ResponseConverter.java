package com.example.feelit.converter;

import com.example.feelit.dto.AiResponse;
import com.example.feelit.dto.FlaskResponse;

public class ResponseConverter {

    public static AiResponse.AiDto toAiDTO(FlaskResponse response){
        return AiResponse.AiDto.builder()
                .inputText(response.getInputText())
                .fear(response.getFear())
                .surprised(response.getSurprised())
                .anger(response.getAnger())
                .sad(response.getSad())
                .neutral(response.getNeutral())
                .happy(response.getHappy())
                .disgust(response.getDisgust())
                .build();
    }
}
