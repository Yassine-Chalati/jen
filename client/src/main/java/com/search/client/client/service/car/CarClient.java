package com.search.client.client.service.car;

import com.search.client.payload.CarPayloadHttp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "car-service")
public interface CarClient {
    @GetMapping("/car/{clientId}")
    public List<CarPayloadHttp> findById(@PathVariable Long clientId);
}
