package org.example.seminar3.hw3.model3;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    String name;
    String athor;
    Double price;
    Integer year;
    Integer pages;
}
