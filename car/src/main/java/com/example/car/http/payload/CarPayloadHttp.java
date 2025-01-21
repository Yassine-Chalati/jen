package com.example.car.http.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CarPayloadHttp {
    private Long id;
    private String brand;
    private String model;
    private String registrationNumber;
    private Long clientId;
}
