//package OOP.seminar1.cw1;
//
//import OOP.seminar1.hw1.BottleOfWater;
//import OOP.seminar1.hw1.Product;
//import OOP.seminar1.hw1.VendingMachine;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class WaterSaleVendingMachine extends VendingMachine {
//    List<Product> bottlesOfWater = new ArrayList<>();
//    @Override
//    public void initProduct(List<Product> bottles) {
//        this.bottlesOfWater = bottles;
//    }
//
//    @Override
//    public String getProduct(String name) {
//        for (Product bow:bottlesOfWater
//             ) {
//            if(bow.getName().equals(name)) return bow.getName() + " " + bow.getPrice();
//        }
//        return new BottleOfWater("не найдено", 0).toString();
//    };
//
//}
