package day04;

import java.util.Scanner;

public class C01_NestedTernaryTekrar {
    public static void main(String[] args) {
         /*
   Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
   Ternary kullanarak;
   Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
   Sayılar birbirine esit degilse, buyuk olan sayıyı ekrana yazdırın.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("sayi1 = " + a);
        System.out.println("sayi2 = " + b);

        System.out.println(a == b ? ("Sayilar birbirine esit") : (a > b ? a : b));

    }
}
