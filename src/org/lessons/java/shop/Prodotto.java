package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    //ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private double vat;
    private Categoria category;

    //COSTRUTTORI

    public Prodotto(String name, String description, double price, double vat)throws IllegalArgumentException {
        createCode();

        if(name.isBlank()){
            throw new NullPointerException();
        }else {
            this.name=name;
        }

        this.description = description;

        if(price<0){
            throw new IllegalArgumentException();
        }else {
            this.price=price;
        }

        if(vat<0){
            throw new IllegalArgumentException();
        }else {
            this.vat= vat;
        }

    }

    //oppure fare un ulteriore costruttore con parametri anche la categoria



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
    public Categoria getCategory() {
        return category;
    }

    //SETTER

    public void setName(String name) {
        if(name.isBlank()){
            throw new NullPointerException();
        }else {
            this.name=name;
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new IllegalArgumentException();
        }else {
            this.price=price;
        }
    }

    public void setVat(double vat) {
        if(vat<0){
            throw new IllegalArgumentException();
        }else {
            this.vat= vat;
        }
    }

    public void setCategory(Categoria category) {
        this.category = category;
    }

    //METODI

    public double getPriceWithVat(){
        double priceWithVat= getPrice()+(getPrice()* getVat()/100);
        return priceWithVat;
    }

    public String getFullName(){
        return code+"-"+name;
    }
    @Override
    public String toString(){
        return getFullName()+": "+ getPriceWithVat()+" euro ("+ category.getName()+")";

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
