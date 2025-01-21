package com.search.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.search.client.entities.Client;
import com.search.client.repositories.ClientRepository;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(ClientRepository clientRepository) {

        return args -> {
            clientRepository.save(new Client(null, "Yassine Chalati", 24F));
            clientRepository.save(new Client(null, "Yassine Chalati", 24F));
            clientRepository.save(new Client(null, "Yassine Chalati", 24F));
            clientRepository.save(new Client(null, "Yassine Chalati", 24F));
            clientRepository.save(new Client(null, "Yassine Chalati", 24F));
            clientRepository.save(new Client(null, "Yassine Chalati", 24F));
            clientRepository.save(new Client(null, "Yassine Chalati", 24F));
            System.out.println("Sample data loaded into the database!");
        };
    }
}
