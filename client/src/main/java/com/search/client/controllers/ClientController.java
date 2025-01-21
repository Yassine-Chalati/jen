package com.search.client.controllers;

import com.search.client.payload.ClientPayloadHttp;
import com.search.client.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService service;

    @GetMapping("/{id}")
    public ClientPayloadHttp findById(@PathVariable Long id) {
        return service.findById(id);
    }
}