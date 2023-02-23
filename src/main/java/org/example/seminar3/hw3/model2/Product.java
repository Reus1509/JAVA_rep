package org.example.seminar3.hw3.model2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {
    String name;
    String country;
    Double weight;
    Double price;
    Integer variety;
}
