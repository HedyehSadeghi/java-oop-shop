package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean validValues=false;
        while(!validValues) {
            System.out.println("dimmi il nome del prodotto:");
            String nome = scanner.nextLine();
            System.out.println("la descrizione del prodotto:");
            String descrizione = scanner.nextLine();
            System.out.println("il prezzo:");
            double prezzo = Double.parseDouble(scanner.nextLine());
            System.out.println("l'iva:");
            double iva = Double.parseDouble(scanner.nextLine());


            //PRODOTTO SCELTO DALL'UTENTE
            try {
                Prodotto prodotto1 = new Prodotto(nome, descrizione, prezzo, iva);
                validValues=true;
                System.out.println("codice del prodotto: " + prodotto1.getCode());
                System.out.println("prezzo base: " + prodotto1.getPrice() + "€");
                System.out.println("prezzo con iva: " + prodotto1.getPriceWithVat() + "€");
                System.out.println("nome completo: " + prodotto1.getFullName());
            } catch (IllegalArgumentException e) {
                if (prezzo < 0) {
                    System.out.println("non hai inserito un prezzo corretto (>0).\nRiprova");
                } else if (iva < 0) {
                    System.out.println("non hai inserito l'iva corretta (>0).\nRiprova");
                }
            } catch (NullPointerException e) {
                System.out.println("non hai inserito un nome valido");
            }
        }




        //PRODOTTO GIA DATO
        Categoria vegetale= new Categoria("frutta", "verde");
        Prodotto prodotto2= new Prodotto("mela","verde",2,4);
        System.out.println("\nSecondo prodotto\nnome: " +prodotto2.getName());
        System.out.println("descrizione: " +prodotto2.getDescription());
        System.out.println("prezzo con iva: " +prodotto2.getPriceWithVat()+ "€");
        prodotto2.setCategory(vegetale);
        System.out.println("categoria: "+ prodotto2.getCategory().toString());
        System.out.println("categoria-nome: "+ prodotto2.getCategory().getName());
        System.out.println("scegli un nuovo prezzo: ");
        prodotto2.setPrice(Double.parseDouble(scanner.nextLine()));
        System.out.println("nuovo prezzo con iva: "+ prodotto2.getPriceWithVat());



        scanner.close();

    }
}
