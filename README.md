# FeelIT - Server

## 프로젝트 개요
이 프로젝트는 텍스트 데이터를 입력 받아, 해당 텍스트의 감정을 분석하고 7가지 감정 비율을 반환하는 스프링 기반 REST API 서버입니다.  
사용자는 POST 요청을 통해 /analyze 엔드포인트에 텍스트 데이터를 전송하고, 감정 분석 결과를 JSON 형태로 받을 수 있습니다.

## 기능
텍스트 입력을 통한 감정 분석
7가지 감정 비율(기쁨, 슬픔, 놀람, 분노, 두려움, 혐오, 중립)의 반환
REST API를 통한 간편한 데이터 교환

## 구조
HTTP 요청을 받아 처리하는 스프링 서버에 요청이 들어오면 요청을 자연어처리 모델이 있는 Flask 서버로 전달하여 감정분석 결과를 받아와 반환하는 구조입니다.

## 사용 예시
요청 예시:
```
POST /analyze
Content-Type: application/json

{
    "text": "오늘은 정말 행복한 하루였다!"
}
```
응답 예시:
```
HTTP/1.1 200 OK
Content-Type: application/json

{
    "happy": 0.75,
    "sad": 0.05,
    "surprised": 0.10,
    "anger": 0.03,
    "fear": 0.02,
    "disgust": 0.01,
    "neutral": 0.04
}
```
