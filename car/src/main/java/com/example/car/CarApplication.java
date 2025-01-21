package com.example.car;

import com.example.car.entities.Car;
import com.example.car.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class CarApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(CarRepository carRepository) {
        return args -> {
            carRepository.save(new Car(null, "Toyota", "Camry", "ABC123", 7L));
            carRepository.save(new Car(null, "Honda", "Civic", "XYZ789", 7L));
            carRepository.save(new Car(null, "Ford", "Mustang", "DEF456", 7L));
            carRepository.save(new Car(null, "Chevrolet", "Malibu", "GHI101", 7L));
            carRepository.save(new Car(null, "Nissan", "Altima", "JKL202", 7L));
            carRepository.save(new Car(null, "Hyundai", "Sonata", "MNO303", 7L));
            carRepository.save(new Car(null, "BMW", "X5", "PQR404", 7L));
            carRepository.save(new Car(null, "Mercedes", "C-Class", "STU505", 7L));
            carRepository.save(new Car(null, "Audi", "A4", "VWX606", 7L));
            carRepository.save(new Car(null, "Tesla", "Model 3", "YZA707", 7L));
            System.out.println("Sample data loaded into the database!");
        };
    }
}
