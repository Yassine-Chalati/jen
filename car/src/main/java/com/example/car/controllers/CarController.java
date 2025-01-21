package com.example.car.controllers;

import com.example.car.entities.Car;
import com.example.car.http.payload.CarPayloadHttp;
import com.example.car.services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
@AllArgsConstructor
public class CarController {
    private CarService carService;

    @GetMapping("/{clientId}")
    public List<CarPayloadHttp> findById(@PathVariable Long clientId) throws Exception {
        return carService.readCarsClient(clientId).stream().map(
                car -> new CarPayloadHttp(
                        car.getId(),
                        car.getBrand(),
                        car.getModel(),
                        car.getRegistrationNumber(),
                        car.getClientId()
                )
        ).toList();
    }
}