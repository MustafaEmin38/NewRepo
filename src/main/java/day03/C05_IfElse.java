package day03;

import java.util.Scanner;

public class C05_IfElse {
    public static void main(String[] args) {

        /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola "
        3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */

       Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 karakterden daha uzun bir kelime yaziniz");
        String kelime=scan.nextLine();
        int uzunluk=kelime.length();

        if (uzunluk<4){//kelime.length<4 de olur
            System.out.println(" 3 Karakterden Daha Uzun Bir Kelime Girmelisiniz ");
        }
        else {//karnabahar==> h nin index i 7. length :10 son uc karakter==>substring(kelime.length()-3)
            String sonUc = kelime.substring(uzunluk - 3);
            System.out.println(sonUc + kelime + sonUc);
        }

        /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola "
        3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız*/


            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen uc karakterden daha uzun bir kelime yaziniz");
            String word = input.next();
            int karakterSayi = word.length();

            if (karakterSayi < 4) {
                System.out.println("3 Karakterden Daha Uzun Bir Kelime Girmelisiniz");
            } else {
                String wordLast = word.substring(word.length() - 3);// karakterSayi-3 de kullanilir
                System.out.println(wordLast + word + wordLast);
            }


    }//Main
}//Class
