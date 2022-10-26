package com.mycompany.phonesoopjava.phones;

// класс кнопочный телефон, который наследуется от интерфейса телефон
public class PushButtonPhone implements IPhone {
    protected String _name;
    protected String _company;
    protected int _simcards;
    protected int _cameras;
    // поле, говорящее о наличии клавиатуры на кнопочном телефоне
    protected boolean _keyboard; 
    // данное поле характерно только для этого класса
    protected Double _price;
    protected int _amount;

    // конструктор без параметров
    public PushButtonPhone() {
        this._name = "НЕИЗВЕСТНО";
        this._company = "НЕИЗВЕСТНО";
        this._simcards = 0;
        this._cameras = 0;
        this._keyboard = false;
        this._price = 0.0;
        this._amount = 0;
    }

    // конструктор копирования
    public PushButtonPhone(PushButtonPhone Orig){
        this._name = Orig.getName();
        this._company = Orig.getCompany();
        this._simcards = Orig.getSIMCards();
        this._cameras = Orig.getCameras();
        this._keyboard = Orig.getKeyboard();
        this._price = Orig.getPrice();
        this._amount = Orig.getAmount();
    }

    // конструктор с параметрами
    public PushButtonPhone(
        String name,
        String company,
        int simcards,
        int cameras,
        boolean keyboard,
        Double price,
        int amount
    ) {
        this._name = name;
        this._company = company;
        this._simcards = simcards;
        this._cameras = cameras;
        this._keyboard = keyboard;
        this._price = price;
        this._amount = amount;
    }

    // перегруженные методы задания и получения названия телефона
    @Override
    public void setName(String name){
        this._name = name;
    }

    @Override
    public String getName(){
        return this._name;
    }

    // перегруженные методы задания и получения компании
    @Override
    public void setCompany(String company){
        this._company = company;
    }

    @Override
    public String getCompany(){
        return this._company;
    }

    // перегруженные методы задания и получения количества СИМ-карт в телефоне
    @Override
    public void setSIMCards(int simcards){
        this._simcards = simcards;
    }

    @Override
    public int getSIMCards(){
        return this._simcards;
    }

    // перегруженные методы задания и получения количества камер в телефоне
    @Override
    public void setCameras(int cameras){
        this._cameras = cameras;
    }

    @Override
    public int getCameras(){
        return this._cameras;
    }

    // уникальные для класса методы получения и задания информации о наличии в телефоне клавиатуры
    public void setKeyboard(boolean keyboard){
        this._keyboard = keyboard;
    }

    public boolean getKeyboard(){
        return this._keyboard;
    }

    // перегруженные методы задания и получения информации о цене телефона
    @Override
    public void setPrice(Double price){
        this._price = price;
    }

    @Override
    public Double getPrice(){
        return this._price;
    }

    // перегруженные методы задания и получения количества телефонов в магазине
    @Override
    public void setAmount(int amount){
        this._amount = amount;
    }

    @Override
    public int getAmount(){
        return this._amount;
    }

    // перегруженный метод вывода полной информации о телефоне
    @Override
    public void printInfo(){
        System.out.format("Название кнопочного телефона: %s%n", this.getName());
        System.out.format("Компания: %s%n", this.getCompany());
        System.out.format("SIM-карт: %d%n", this.getSIMCards());
        System.out.format("Камер: %d%n", this.getCameras());
        System.out.format("Клавиатура: %s%n", this.getKeyboard() ? "Имеется" : "Отсутствует");
        System.out.format("Цена (руб.): %.2f%n", this.getPrice());
        System.out.format("Количество (шт.): %d%n", this.getAmount());
        System.out.println("");
    }
}