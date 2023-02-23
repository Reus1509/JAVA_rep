package org.example.seminar3.hw3.model3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Финансист", "Драйзер", 270.00, 2022, 735);
        Book book2 = new Book("Первые русские цари: Иван Грозный, Борис Годунов (сборник)", "Акунин", 449.00, 2010, 509);
        Book book3 = new Book("Война с Ганнибалом", "Ливий", 200.00, 2017, 440);
        Book book4 = new Book("Американские боги", "Гейман", 300.00, 2019, 612);
        Book book5 = new Book("Титан", "Драйзер", 350.00, 2017, 702);
        Book book6 = new Book("Грокаем алгоритмы", "Бхаргава", 1000.00, 2022, 288);
        Book book7 = new Book("Программируем на Java", "Лой", 2000.00, 2023, 521);
        Book book8 = new Book("Тайм-драйв", "Архангельский", 400.00, 2011, 263);
        Book book9 = new Book("Продажи для топов", "Лукича", 1500.00, 2009, 283);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);

        List<String> bookNames = new ArrayList<>();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getPages() % 2 != 0 && bookList.get(i).getPages() % 3 != 0 && bookList.get(i).getPages() % 5 != 0 && bookList.get(i).getPages() % 7 != 0) {
                if (bookList.get(i).getYear() >= 2010) {
                    if(bookList.get(i).getAthor().toLowerCase(Locale.ROOT).indexOf("а") != -1){
                        bookNames.add(bookList.get(i).getName());
                    }
                }
            }
        }
        System.out.println("Книги, которые подходят по условию: ");

        for (String name:bookNames
             ) {
            System.out.println("--- " + name + " ---");
        }
    }
}
