package day02;

import java.util.Scanner;

public class C02_MethodCreationTekrar {

    public static void main(String[] args) {
        //Kullanicidan Fahrenheit cinsi bir deger girmesini isteyin
        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8
        //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Fahrenheit cinsi bir deger giriniz");
        double userF=input.nextDouble();
        System.out.println("Kullanici F degeri = " + userF);

       double userC=celCevirme(userF);
       System.out.println("Kullanici C degeri = " + userC);


    }//Main

    public static double celCevirme(double userF) {
        double userC=(userF-32)/1.8;
        return userC;
    }

}//Class
