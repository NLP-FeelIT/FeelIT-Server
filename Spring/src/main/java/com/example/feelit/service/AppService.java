package com.example.feelit.service;

import com.example.feelit.converter.ResponseConverter;
import com.example.feelit.dto.AiResponse;
import com.example.feelit.dto.FlaskResponse;
import com.example.feelit.dto.InputModel;
import com.example.feelit.dto.RequestDto;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Service
@Slf4j
public class AppService {

    private final RestTemplate restTemplate;

    public AppService(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    @SneakyThrows
    public AiResponse.AiDto getResults(RequestDto requestDto) {
        String url = "http://34.64.212.10:5000/predict";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<InputModel> entity = new HttpEntity<>(new InputModel(requestDto.getSentence()), headers);
        ResponseEntity<FlaskResponse> response = restTemplate.postForEntity(url, entity, FlaskResponse.class);
        log.info("Sleep 시작");
        Thread.sleep(1000);
        log.info("Sleep 종료");
        return ResponseConverter.toAiDTO(response.getBody());
    }

}
