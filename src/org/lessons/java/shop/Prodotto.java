package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    //ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private double vat;


    //COSTRUTTORI

    public Prodotto(String name, String description, double price, double vat) {
        createCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }



    //GETTER

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getVat() {
        return vat;
    }
    //SETTER

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = valueOrDefault(price);
    }

    public void setVat(double vat) {
        this.vat = valueOrDefault(vat);
    }

    //METODI

    public double getPriceWithVat(){
        double priceWithVat= getPrice()+(getPrice()* getVat()/100);
        return priceWithVat;
    }

    public String getFullName(){
        return code+"-"+name;
    }


    //METODI PRIVATE

    Random random= new Random();

    private void createCode(){
        int randomNumber= random.nextInt(Integer.MAX_VALUE-1000);
        code = randomNumber;
    }

    private double valueOrDefault(double value){
        if (value>=0){
            return value;
        } else{
            return 1;
        }
    }


}
