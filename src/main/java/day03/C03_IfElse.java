package day03;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        //Ornek:
        // kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın
        /*Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();

        if(sayi1>0 && sayi2>0){
            System.out.println(sayi1+sayi2);
        } else if (sayi1<0 && sayi2<0) {
            System.out.println(sayi1*sayi2);
        } else if((sayi1>0 && sayi2<0) || (sayi1<0 && sayi2>0)){//sayi1*sayi2<0 bu da olur, //sayi1<0 || sayi2<0 bu da olur
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");
        }else {
            System.out.println("Sıfır çarpmaya göre yutan elamandır");
        }*/

        //* Ornek
        //kullanıcıdan iki sayı isteyin
        //1.sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //2.ikisi de negatifse sayıların çarpımını yazdırın
        //3.ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın yazdirin
        //4.sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen ayri ayri iki sayi giriniz");
        double num1=input.nextDouble();
        double num2=input.nextDouble();

        if (num1 > 0 && num2 > 0) {
            System.out.println(num1 + num2);
        } else if (num1 < 0 && num2 < 0) {
            System.out.println(num1 * num2);
        } else if (num1 * num2 < 0) {
            System.out.println("farklı işaretlerde sayılarla işlem yapamazsın");
        } else {
            System.out.println("sıfır çarpmaya göre yutan elamandır");
        }

    }//Main
}//Class
