package day04;

import java.util.Scanner;

public class C04_SwitchTekrar {
    public static void main(String[] args) {
        /*
       Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.
       Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
            puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
            puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
            puanı 2,5-3,5 arasında ise UST seviyesi veriniz
            puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz
            seviyesini yazdırınız
      switch case kullanarak KALDI seviyesine F harf notu veriniz
                             GECTİ seviyesine D harf notu veriniz
                             IYI seviyesine C harf notu veriniz
                             UST seviyesine B harf notu veriniz
                             HARİKA seviyesine A harf notu veriniz
           harf notunu yazdırınız
      */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 0-4 arası puanınızı giriniz");
        double puan=scan.nextDouble();
        String seviye="";

        if(puan<0 || puan>4){
            System.out.println("İstenen aralikta deger giriniz");
            seviye="Yok";
        }else if(puan<1){
            seviye="KALDI";
        } else if (puan<2) {
            seviye="GECTI";
        }else if (puan<2.5) {
            seviye="IYI";
        }else if (puan<3.5) {
            seviye="UST";
        }else if (puan<4) {
            seviye="HARIKA";
        }
        System.out.println("seviye = " + seviye);

        switch (seviye){
            case "KALDI":
                System.out.println("F");break;
            case "GECTI":
                System.out.println("D");break;
            case "IYI":
                System.out.println("C");break;
            case "UST":
                System.out.println("B");break;
            case "HARIKA":
                System.out.println("A");break;
            default:

        }


    }//main
}
