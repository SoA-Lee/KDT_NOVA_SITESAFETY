package org.example.nova.robot.service;

import org.example.nova.robot.dto.ElevatorStatusGetRequest;
import org.example.nova.robot.dto.ElevatorStatusResponse;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Service
public class RobotService {

    private final RestTemplate restTemplate;

    // TODO restTemplate을 사용해 아파트 단지 서버에 요청을 보내주세요!
    public RobotService(RestTemplateBuilder builder) {
        this.restTemplate = builder
                .setConnectTimeout(Duration.ofSeconds(2))  // 연결 타임아웃 2초
                .setReadTimeout(Duration.ofSeconds(5))     // 읽기 타임아웃 5초
                .build();
    }

    public ElevatorStatusResponse getElevatorStatus(ElevatorStatusGetRequest request) {
        // TODO 이곳을 채워주세요.
        return null;
    }

    // TODO 아래 메서드를 사용해 적절한 아파트 단지서버에 HTTP 요청을 보내주세요.
    private String getApartmentServerUrl(String apartmentId) { // 1 or 2
        if (apartmentId.equals("1")) {
            return "http://localhost:8080/apartment/good";
        }

        if (apartmentId.equals("2")) {
            return "http://localhost:8080/apartment/bad";
        }

        return null;
    }
}
