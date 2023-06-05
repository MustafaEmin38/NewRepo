package day02;

import java.util.Scanner;

public class C04_ScannerTekrar {
    public static void main(String[] args) {
        //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir karakter yaziniz");
        //Scanner objectinde nextChar() methodu yoktur
        //bu yuzden kullanicinin karakter olarak girdigi datayi, string olarak aliyorum
        //sonra bu stringin 0. index indeki karakteri charAt(0) methodu ile aliyorum
        //burda charAt(0) ilk karakter demektir.
        char krktr=input.next().toUpperCase().charAt(0);
        System.out.println("karakter = "+krktr);

        System.out.println("  "+krktr+"  ");
        System.out.println(" "+krktr+" "+krktr+" ");
        System.out.println(krktr+" "+krktr+" "+krktr);
        // \n isareti south icinde bir alt satira gecmeye yarar ve " " icinde yazilir
        System.out.println("  "+krktr+"  \n "+krktr+" "+krktr+" \n"+krktr+" "+krktr+" "+krktr);
    }//Main
}//Class
