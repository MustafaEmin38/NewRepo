package day03;

import java.util.Scanner;

public class C06_TernaryTekrar {
    public static void main(String[] args) {
        //kullanıcıdan pozitif bir sayı alınız
        //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
        // ve yazdıran bir method olusturun
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz");
        int sayi=input.nextInt();
        kacBasamakli(sayi);

        kacBasamaktir(sayi);
    }//Main

    public static void kacBasamaktir(int sayi) {
        System.out.println(sayi>99?"Sayi uc veya ucten daha cok bas":"Sayi ucten az bas");
    }

    public static void kacBasamakli(int sayi) {String basamakSayisi=sayi>99?"Sayi uc veya ucten daha cok basakmaklidir":"Sayi ucten az basamaklidir";
        System.out.println(basamakSayisi);}


}//Class
