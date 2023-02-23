package org.example.seminar3.hw3.model1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Диван 'Высший уровень'", 12445.00, 1);
        Product product2 = new Product("Кресло", 1200.45, 2);
        Product product3 = new Product("Стол", 3599.99, 1);
        Product product4 = new Product("Высший сорт мука", 240.45, 3);
        Product product5 = new Product("Маркер", 1200.45, 1);
        Product product6 = new Product("Картина высший уровень мастерства", 1200.45, 2);
        Product product7 = new Product("Карандаш", 1200.45, 1);

        List<Product> allProducts = new ArrayList<>();
        allProducts.add(product1);
        allProducts.add(product2);
        allProducts.add(product3);
        allProducts.add(product4);
        allProducts.add(product5);
        allProducts.add(product6);
        allProducts.add(product7);

        Double max = (double) 0;
        String name = null;
        for (int i = 0; i < allProducts.size(); i++) {
            if (allProducts.get(i).getName().toLowerCase(Locale.ROOT).contains("высший")){
                if (allProducts.get(i).getSort().equals(1) || allProducts.get(i).getSort().equals(2)){
                    if(allProducts.get(i).getPrice() > max){
                        max = allProducts.get(i).getPrice();
                        name = allProducts.get(i).getName();
                    } else {
                        System.out.println("Наивысшая цена среди товаров 1 или 2 сорта, название которых содержит слово 'высший' - " + max + " у товара: " + name);
                    }
                }
            }
        }
    }
}
