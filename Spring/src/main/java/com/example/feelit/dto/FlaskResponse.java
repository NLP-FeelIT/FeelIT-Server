package com.example.feelit.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FlaskResponse {
    private String inputText;
    private double fear;
    private double surprised;
    private double anger;
    private double sad;
    private double neutral;
    private double happy;
    private double disgust;
}
