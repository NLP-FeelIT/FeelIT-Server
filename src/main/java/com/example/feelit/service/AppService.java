package com.example.feelit.service;

import com.example.feelit.converter.ResponseConverter;
import com.example.feelit.dto.AiResponse;
import org.springframework.stereotype.Service;

@Service
public class AppService {

//    @Value("${model.path}") //서버에 저장된 모델의 경로를 application.properties에서 가져옴
//    private String modelPath;
//
//    private Module module;
//
//    @PostConstruct
//    public void init() {
//        // 모델 로딩
//        this.module = Module.load(modelPath);
//    }

    public String getResults(String inputText) {
        // 입력 텍스트를 모델의 입력 형식에 맞게 변환
//        Tensor inputTensor = textToTensor(inputText);

        // 모델 실행


        // 결과 포맷팅 및 반환
        return null;
    }

    public AiResponse.AiDto sampleResults(String inputText) {
        return ResponseConverter.toAiDTO(inputText, "공포: 10%, 놀람: 10%, 분노: 10%, 슬픔: 30%, 중립: 10%, 행복: 15%, 혐오: 15%");
    }

}
