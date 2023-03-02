package seminar6.hw6.model;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Brand hp = new Brand("HP", "USA", "English");
        Brand samsung = new Brand("Samsung", "S.Korea", "Korean");
        Brand lenovo = new Brand("Lenovo", "Hong-Kong", "Chinese");
        Brand apple = new Brand("Apple", "USA", "English");
        Brand asus = new Brand("ASUS", "Taiwan", "Chinese");
        Brand acer = new Brand("ACER", "Taiwan", "Chinese");

        Laptop hp_pavilion = new Laptop(hp, "hp_pavilion", 16, "4k",
                true, 500, "16", "Windows", "black");

        Laptop samsung_galaxy = new Laptop(samsung,"hp_galaxy", 14, "FullHD",
                true, 500, "8", "Windows", "white");
        Laptop samsung_a32 = new Laptop(samsung,"samsung_a32", 18, "FullHD",
                true, 300, "8", "Windows", "black");

        Laptop samsung_ms = new Laptop(samsung, "samsung_ms", 16, "4k",
                false, 1000, "16", "Linux", "black");

        Laptop lenovo_76 = new Laptop(lenovo,"lenovo_76", 16, "FullHD",
                true, 700, "8", "Windows", "white");

        Laptop macbook_13 = new Laptop(apple, "macbook_13", 17, "4k",
                false, 1000, "8", "ios", "white");

        Laptop asus_x51 = new Laptop(asus,"asus_x51", 17, "FullHD",
                true, 300, "4", "Windows", "black");

        Laptop acer_11 = new Laptop(acer,"acer_11", 19, "FullHD",
                true, 600, "8", "Windows", "black");

        Laptop acer_13 = new Laptop(acer, "acer_13" ,18, "4k",
                false, 500, "16", "Windows", "black");

        Laptop acer_14 = new Laptop(acer,"acer_14", 16, "FullHD",
                true, 500, "8", "Windows", "black");


        Set <Laptop> allLaptops = new HashSet<>();
        allLaptops.add(hp_pavilion);
        allLaptops.add(samsung_galaxy);
        allLaptops.add(samsung_a32);
        allLaptops.add(samsung_ms);
        allLaptops.add(lenovo_76);
        allLaptops.add(macbook_13);
        allLaptops.add(asus_x51);
        allLaptops.add(acer_11);
        allLaptops.add(acer_13);
        allLaptops.add(acer_14);
        ;
        System.out.println("-----МЕТОД ПОИСКА 1-----");
        System.out.println("по вашему запросу найдено: " + Laptop.filter(allLaptops));
        System.out.println("------------------------");
        System.out.println("-----МЕТОД ПОИСКА 2-----");
        System.out.println(Laptop.newFilter(allLaptops));
        System.out.println("------------------------");
    }
}
