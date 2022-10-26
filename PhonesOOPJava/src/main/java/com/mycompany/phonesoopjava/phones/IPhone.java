package com.mycompany.phonesoopjava.phones;

// интерфейс телефон
public interface IPhone {
    // методы задать и получить название телефона
    void setName(String name);

    String getName();

    // методы задать и получить название компании, что создала телефон
    void setCompany(String company);

    String getCompany();

    // методы задать и получить количество СИМ-карт в телефоне
    void setSIMCards(int simcards);

    int getSIMCards();

    // методы задать и получить количество камер в телефоне
    void setCameras(int cameras);

    int getCameras();

    // методы задать и получить информацию о цене телефона
    void setPrice(Double price);

    Double getPrice();

    // методы задать и получить количество телефонов в магазине
    void setAmount(int amount);

    int getAmount();

    // метод вывода полной информации о телефоне
    void printInfo();
}