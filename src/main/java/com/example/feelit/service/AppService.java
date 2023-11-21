package com.example.feelit.service;

import com.example.feelit.converter.ResponseConverter;
import com.example.feelit.dto.AiResponse;
import com.example.feelit.dto.FlaskResponse;
import com.example.feelit.dto.InputModel;
import com.example.feelit.dto.RequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppService {

    private final RestTemplate restTemplate;

    public AppService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    public AiResponse.AiDto getResults(RequestDto requestDto) {
        String url = "http://34.64.212.10:5000/predict";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<InputModel> entity = new HttpEntity<>(new InputModel(requestDto.getSentence()), headers);
        ResponseEntity<FlaskResponse> response = restTemplate.postForEntity(url, entity, FlaskResponse.class);
        return ResponseConverter.toAiDTO(response.getBody());
    }

}
