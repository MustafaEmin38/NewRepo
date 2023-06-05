package day02;

public class C01_odev {
    //iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz
    // main methodun içinde tanimladigim iki sayinin kareleri toplamını bulan ve yazdıran bir method oluşturun

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
    kareToplaYazdir(a,b);//buradaki parantez icindeki variable lara argument denir.

        int c=4;
        int d=5;
        karelerToplam(c,d);

    }//main

    public static void karelerToplam(int c, int d) { int topla= (c*c)+(d*d);

        System.out.println(topla);
    }

    public static void kareToplaYazdir (int sayi1, int sayi2){//method parantezinin icine method body de kullanacagimiz variable ler tanımliyoruz
        //bunlara parametre denir
        int toplam = (sayi1*sayi1)+(sayi2*sayi2);
        System.out.println("toplam = " + toplam);
    }

}//Class

