package com.search.client.services;

import com.search.client.client.service.car.CarClient;
import com.search.client.entities.Client;
import com.search.client.payload.CarPayloadHttp;
import com.search.client.payload.ClientPayloadHttp;
import com.search.client.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {
    private ClientRepository clientRepository;
    private CarClient carClient;

    public ClientPayloadHttp findById(Long id) {
        List<CarPayloadHttp> cars = carClient.findById(id);
        Client client = clientRepository.findById(id).get();
        return new ClientPayloadHttp(
                new com.search.client.payload.strucutre.Client(
                        client.getId(),
                        client.getNom(),
                        client.getAge()
                ),
                cars.stream().map(
                        car -> new com.search.client.payload.strucutre.Car(
                                car.getId(),
                                car.getBrand(),
                                car.getModel(),
                                car.getRegistrationNumber()
                        )
                ).toList()
        );
    }
}
