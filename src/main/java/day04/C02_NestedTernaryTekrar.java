package day04;

import java.util.Scanner;

public class C02_NestedTernaryTekrar {
    public static void main(String[] args) {
        /*
    Kullanıcıdan bir karakter sisteme girmesini isteyin.
    Ternary kullanarak;
    bu karakterin bir harf olup olmadıgını kontrol edin.
    Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
    Harf degilse konsola "Harf Degil" yazdırın
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter yaziniz");
        char krkt=scan.next().charAt(0);

        String sonuc=krkt >= 'A' && krkt <= 'Z' || krkt >= 'a' && krkt <= 'z' ? krkt >= 'A' && krkt <= 'Z' ? "Buyuk harf" : "Kucuk harf" : "Harf degil";

        System.out.println(sonuc);





    }//main
}//class
