package com.example.feelit.service;

import jakarta.annotation.PostConstruct;
import org.pytorch.Module;
import org.pytorch.Tensor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Value("${model.path}") //서버에 저장된 모델의 경로를 application.properties에서 가져옴
    private String modelPath;

    private Module module;

    @PostConstruct
    public void init() {
        // 모델 로딩
        this.module = Module.load(modelPath);
    }

    public String getResults(String inputText) {
        // 입력 텍스트를 모델의 입력 형식에 맞게 변환
//        Tensor inputTensor = textToTensor(inputText);

        // 모델 실행


        // 결과 포맷팅 및 반환
        return null;
    }

    private void textToTensor(String text) {
        // 텍스트를 텐서로 변환하는 로직 구현
        // ...
        // 변환된 결과 반환
    }

    private void formatOutput(Tensor outputTensor) {
        // 텐서를 문자열로 변환하는 로직 구현
        // ...
    }

}
