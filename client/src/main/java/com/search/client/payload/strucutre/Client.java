package com.search.client.payload.strucutre;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {
    private Long id;
    private String nom;
    private Float age;
}
