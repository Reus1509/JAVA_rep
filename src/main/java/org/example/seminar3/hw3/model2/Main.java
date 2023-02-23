package org.example.seminar3.hw3.model2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Диван", "Россия", 78.50, 21000.00, 2);
        Product product2 = new Product("Кресло", "Испания", 25.00, 2300.99, 1);
        Product product3 = new Product("Стул", "Франция", 7.34, 760.00, 2);
        Product product4 = new Product("Стол", "Израиль", 24.60, 2300.99, 1);
        Product product5 = new Product("Комод", "Россия", 25.00, 5000.00, 3);
        Product product6 = new Product("Зеркало", "Россия", 10.00, 3100.00, 3);
        Product product7 = new Product("Кухонный гарнитур", "Россия", 115.00, 10500.00, 1);
        Product product8 = new Product("Табурет", "Франция", 2.00, 760.00, 2);

        List<Product> allProducts = new ArrayList<>();
        allProducts.add(product1);
        allProducts.add(product2);
        allProducts.add(product3);
        allProducts.add(product4);
        allProducts.add(product5);
        allProducts.add(product6);
        allProducts.add(product7);
        allProducts.add(product8);

        Integer maxSort = 0;
        for (int i = 0; i < allProducts.size(); i++) {
            if(allProducts.get(i).getVariety() > maxSort){
                maxSort = allProducts.get(i).getVariety();
            }
        }

        Integer searchSort = getUserVariety(maxSort);

        List<String> productNames = new ArrayList<>();
        Double minPrice = allProducts.get(0).getPrice();
        Double searchPrice = 0.0;

        for (int i = 0; i < allProducts.size(); i++) {
            if(allProducts.get(i).getVariety().equals(searchSort)) {
                if (allProducts.get(i).getPrice() < minPrice) {
                    minPrice = allProducts.get(i).getPrice();
                    searchPrice = minPrice;
                }
            }
            if(allProducts.get(i).getPrice().equals(searchPrice)){
                productNames.add(allProducts.get(i).getName());
            }
        }
        System.out.printf("Товары %d сорта с минимальной ценой %.2f это: ", searchSort, minPrice);
        for (String name:productNames
             ) {
            System.out.printf("%s ", name);
        }
    }

    /**
     * @param maxSort максимальный сорт в списке
     * @return Искомый сорт, либо что такого сорта нет
     */
    public static Integer getUserVariety(Integer maxSort){
        System.out.print("Введите искомый сорт: ");
        Scanner myScanner = new Scanner(System.in);
        Integer sort = myScanner.nextInt();
        myScanner.close();
        if(sort>maxSort){
            System.out.println("Сожалеем, товара с таким сортом: ");
        } else {return sort;}
        return 0;
    }
}
