package day04;

import java.awt.*;
import java.util.Scanner;

public class C06_ForLoopTekrar {
    public static void main(String[] args) {
        /*
      Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
      kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
     */
        //arabacami

        Scanner input=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String  kelime=input.next().toLowerCase();
         int counter=0;
         for (int i=0; i<kelime.length();i++){
             char krkt=kelime.charAt(i);
             if (krkt=='c'){
                 break;
             } else if (krkt=='a'){
                 counter++;}
        }
        System.out.println("Bu kelimede 'c' harfine kadar "+counter+" tane 'a' var");





    }//main
}
