package OOP.seminar1.hw1;

import java.util.ArrayList;
import java.util.List;

public class HotSellVendingMachine extends VendingMachine{

    List<Product> allCoffees = new ArrayList<>();
    @Override
    public void initProduct(List<Product> coffees) {
        this.allCoffees = coffees;
    }

    @Override
    public String getProduct(String name) {
        for (Product cof:allCoffees
        ) {
            if(cof.getName().equals(name)) return cof.getName() + " " + cof.getPrice();
        }
        return new Coffee("не найдено", 0, 0, 0).toString();
    }

    public String getProduct(String name, Integer volume, Integer temperature) {
        for (Product cof:allCoffees
        ) {
            if(cof.getName().equals(name)){
                if(cof.getVolume().equals(volume)){
                    if(cof.getTemperature().equals(temperature)) return cof.getName() + " цена: " + cof.getPrice() + " объем:" + cof.getVolume() + " температура:" + cof.getTemperature();
                }
            }
        }
        return new Coffee("не найдено", 0,0,0).toString();
    }
}
