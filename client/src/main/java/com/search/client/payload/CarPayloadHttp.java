package com.search.client.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarPayloadHttp {
    private Long id;
    private String brand;
    private String model;
    private String registrationNumber;
    private Long clientId;
}
