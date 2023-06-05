package day02;

import java.util.Scanner;

public class C03_Scanner {
    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırınz
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        double a=scan.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        double b=scan.nextDouble();
        boolean sonuc=karelerEsitMi(a,b);
        System.out.println(sonuc);


    }//main method
    public static boolean karelerEsitMi(double a,double b){
        boolean sonuc=(a*a)==(b*b);
        return sonuc;
    }

}//Class
