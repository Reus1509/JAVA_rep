package org.example.seminar3.cw3.model2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Student {
    String surname;
    Integer group;
    Integer money;
    List<Integer> ball;
}
