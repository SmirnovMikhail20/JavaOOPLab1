package com.mycompany.phonesoopjava;
import com.mycompany.phonesoopjava.phones.*;

import java.util.ArrayList;

public class PhonesOOPJava {

    public static void main(String[] args) {
        System.out.println("В данной программе демонстрируется работа с классами PushButtonPhone (Кнопочный Телефон)"
                + " и Smartphone (Смартфон), производными от интерфейса IPhone (ИТелефон).");
        
        System.out.println("Создаем и заполняем список телефонов...");
        ArrayList<IPhone> phones = new ArrayList<IPhone>();
        
        // добавляем кнопочные телефоны
        phones.add(new PushButtonPhone("Nokia 3310", "Nokia", 1, 0, false, 250.00, 10));
        phones.add(new PushButtonPhone("Sony Ericsson Walkman", "Sony", 1, 1, false, 750.00, 3));
        phones.add(new PushButtonPhone("BlackBerry Bold 9000", "BlackBerry", 2, 2, true, 3000.00, 1));
        
        // добавляем смартфоны
        phones.add(new Smartphone("Sasmung Galaxy S22", "Samsung", 2, 4, true, 8192, 20000.00, 10));
        // создаем смартфон Xiaomi Mi 6
        Smartphone xmi6 = new Smartphone("Xiaomi Mi 6", "Xiaomi", 2, 3, false, 4096, 6000.00, 50);
        // используя конструктор копирования, создаем более новую модель Xiaomi Mi
        Smartphone xmi7 = new Smartphone(xmi6);
        xmi7.setName("Xiaomi Mi 7");
        xmi7.setPrice(8000.00);
        phones.add(xmi6); 
        phones.add(xmi7); 
        
        System.out.println("Выводим полную информацию о каждом телефоне из списка...\n");
        phones.forEach((phone) -> {phone.printInfo();});
        
        System.out.println("Выведем название каждого телефона, который имеет как минимум 2 СИМ-карты...");
        phones.forEach((phone) ->
            {
                if (phone.getSIMCards() >= 2)
                    System.out.println(phone.getName());
            });
    }
}