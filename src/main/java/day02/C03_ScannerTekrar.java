package day02;

import java.util.Scanner;

public class C03_ScannerTekrar {
    public static void main(String[] args) {
        //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
        //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırınz
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int num1=input.nextInt();
        int num2=input.nextInt();
        boolean karelerEsitMiSonuc=karelerEsitMi(num1,num2);
        System.out.println(karelerEsitMiSonuc);

    }//Main
    public static boolean karelerEsitMi(int a, int b){
        boolean sonuc=(a*a) == (b*b);
        return sonuc;
    }
}//Class
