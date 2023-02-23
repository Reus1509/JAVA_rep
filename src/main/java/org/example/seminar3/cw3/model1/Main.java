package org.example.seminar3.cw3.model1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ItemInfo item1 = new ItemInfo("Диван", "Россия", 3);
        ItemInfo item2 = new ItemInfo("Кресло", "Китай", 2);
        ItemInfo item3 = new ItemInfo("Кресло", "Вьетнам", 3);
        ItemInfo item4 = new ItemInfo("Кресло", "Вьетнам", 3);
        List<ItemInfo> itemInfoList  = new ArrayList<ItemInfo>();
        itemInfoList.add(item1); //наполняем
        itemInfoList.add(item2);
        itemInfoList.add(item3);
        itemInfoList.add(item4);
        System.out.println(itemInfoList);
        String searchName = "Кресло";
        Integer sumValue = 0;
        List <String> country = new ArrayList<>();
        for (int i = 0; i < itemInfoList.size(); i++) {
            if(itemInfoList.get(i).getItemName().equals(searchName)){
                sumValue += itemInfoList.get(i).getValue();
                boolean f = true;
                for (int j = 0; j < country.size(); j++) {
                    if(itemInfoList.get(i).getCountry().equals(country.get(j))){
                        f = false;
                    }
                }
                if(f){
                    country.add(itemInfoList.get(i).getCountry());
                }
            }
        }

        System.out.println("Countries = " + country);
        System.out.println("SumValue = " + sumValue);
    }
}
