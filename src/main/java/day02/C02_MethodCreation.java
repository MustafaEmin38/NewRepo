package day02;

import java.util.Scanner;

public class C02_MethodCreation {
    //Kullanicidan Fahrenheit cinsi bir deger girmesini isteyin
    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8
    //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

    public static void main(String[] args) {
        //Kullanicidan veri almak icin 1. scanner object i olustur
           Scanner      scan            =  new    Scanner(System.in);
        //data type    object ismi      keyword   Contructor
        //Kullaniciya bir mesaj gonderelim

        System.out.println("Lutfen Fahrenheit cinsi bir sicaklik girin ");
        double fahrenheit = scan.nextDouble();

        System.out.println("fahrenheit = " + fahrenheit);
        //main method icinden method olustururken
        //methodumuza verecegimiz ismi yazıyoruz
        //method parantezinin icine argument yaziyoruz
        double celsius=fahrToCels(fahrenheit); //method parantezinin icine neyi degistireceksek onu yazariz
        System.out.println("celsius = " + celsius);
    }//main

    public static double fahrToCels(double fahrenheit) {
        //formul: c = (f -32)/18
        double celsius=(fahrenheit-32)/1.8;
        return celsius;// return
    }

}//Class
