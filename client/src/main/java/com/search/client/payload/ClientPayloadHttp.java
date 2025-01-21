package com.search.client.payload;

import com.search.client.payload.strucutre.Car;
import com.search.client.payload.strucutre.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientPayloadHttp {
    private Client client;
    private List<Car> car;
}
