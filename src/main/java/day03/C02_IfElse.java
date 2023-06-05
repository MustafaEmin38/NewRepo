package day03;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
        //Ornek: Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();

        if(sayi1>sayi2){
            System.out.println("Sayi1 sayi2 den buyuktur");
        }else {
            System.out.println("Sayi1 sayi2 den buyuk degildir");
        }

        //* Ornek: Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen ayri ayri iki sayi giriniz");
        double num1=input.nextDouble();
        double num2=input.nextDouble();

        if(num1>num2){
            System.out.println("Birinci sayi ikinci sayidan buyuktur");
        }else {
            System.out.println("Birinci sayi ikinci sayidan buyuk degildir");
        }



    }//Main
}//Class
