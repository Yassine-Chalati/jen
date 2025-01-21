package com.search.client.payload.strucutre;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Long id;
    private String brand;
    private String model;
    private String registrationNumber;

}
