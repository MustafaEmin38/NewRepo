package day04;

import java.util.Scanner;

public class C03_SwitchTekrar {

    public static void main(String[] args) {
        // Kullanıcıdan uc basamaklı pozitif bir sayı sisteme girmesini isteyiniz
        // Bu sayıyı okunuşuna çeviren bir kod yazınız.
        /*
        125
        yuz
        yirmi
        bes
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("uc basamakli pozitif bir sayi giriniz");
        int sayi=scan.nextInt();
        if(sayi<1000 && sayi>99) {
            int yuzlerBas = sayi / 100;
            int onlarBas = (sayi / 10) % 10;
            int birlerBas = sayi % 10;

            switch (yuzlerBas) {
                case 1:
                    System.out.println("yuz");break;
                case 2:
                    System.out.println("iki yuz");break;
                case 3:
                    System.out.println("uc yuz");break;
                case 4:
                    System.out.println("dort yuz");break;
                case 5:
                    System.out.println("bes yuz");break;
                case 6:
                    System.out.println("alti yuz");break;
                case 7:
                    System.out.println("yedi yuz");break;
                case 8:
                    System.out.println("sekiz yuz");break;
                case 9:
                    System.out.println("dokuz yuz");break;}

                    switch (onlarBas){
                        case 1:
                            System.out.println("on");break;
                        case 2:
                            System.out.println("yirmi");break;
                        case 3:
                            System.out.println("otuz");break;
                        case 4:
                            System.out.println("kirk");break;
                        case 5:
                            System.out.println("elli");break;
                        case 6:
                            System.out.println("altmis");break;
                        case 7:
                            System.out.println("yetmis");break;
                        case 8:
                            System.out.println("seksen");break;
                        case 9:
                            System.out.println("doksan");break;}
            switch (birlerBas){
                case 1:
                    System.out.println("bir");break;
                case 2:
                    System.out.println("iki");break;
                case 3:
                    System.out.println("uc");break;
                case 4:
                    System.out.println("dort");break;
                case 5:
                    System.out.println("bes");break;
                case 6:
                    System.out.println("alti");break;
                case 7:
                    System.out.println("yedi");break;
                case 8:
                    System.out.println("sekiz");break;
                case 9:
                    System.out.println("dokuz");break;
                    }
        }else {
            System.out.println("sayi uc basamakli degildir");
        }
    }//main
}
