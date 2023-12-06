package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("dimmi il nome del prodotto:");
        String nome= scanner.nextLine();
        System.out.println("la descrizione del prodotto:");
        String descrizione= scanner.nextLine();
        System.out.println("il prezzo:");
        double prezzo= Double.parseDouble(scanner.nextLine());
        System.out.println("l'iva:");
        double iva= Double.parseDouble(scanner.nextLine());

        Prodotto prodotto1= new Prodotto(nome,descrizione,prezzo,iva);
        System.out.println(prodotto1.getCode());
        System.out.println(prodotto1.getPriceWithVat());
        System.out.println(prodotto1.getFullName());



        scanner.close();

    }
}
