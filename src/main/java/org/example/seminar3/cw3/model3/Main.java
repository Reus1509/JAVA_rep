package org.example.seminar3.cw3.model3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer sumV = 0;
        Integer sum = 0;
        Integer derSum = 0;

        Cub cub1 = new Cub(3, 2, "Красный", "Деревянный");
        Cub cub2 = new Cub(2, 3, "Желтый", "Деревянный");
        Cub cub3 = new Cub(4, 3, "Зеленый", "Металлический");
        Cub cub4 = new Cub(3, 2, "Желтый", "Картонный");
        Cub cub5 = new Cub(2, 1, "Красный", "Деревянный");

        List<Cub> allCubs = new ArrayList<>();
        allCubs.add(cub1);
        allCubs.add(cub2);
        allCubs.add(cub3);
        allCubs.add(cub4);
        allCubs.add(cub5);


        for (int i = 0; i < allCubs.size(); i++) {
            if (allCubs.get(i).getColor().equals("Желтый")) {
                sum++;
                sumV += VOfCub(allCubs.get(i).getLen());
            }
            if (allCubs.get(i).getMaterial().equals("Деревянный") && allCubs.get(i).getDlinaRebra().equals(3)) {
                derSum++;
            }
        }


        System.out.println("Кубов желтого цвета - " + sum + " ,общий объем - " + sumV);
        System.out.println("Деревянных кубиков с длиной ребра 3см - " + derSum);
    }

    public static Integer VOfCub(Integer dlina) {
        Integer V = dlina * dlina * dlina;
        return V;
    }
}
