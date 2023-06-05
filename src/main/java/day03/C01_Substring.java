package day03;

import java.util.Scanner;

public class C01_Substring {
    public static void main(String[] args) {
        /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */
        Scanner scan= new Scanner(System.in);
        System.out.println("Ad ve Soyadınızı aralarında bir bosluk olacak sekılde yaziniz");
        String adSoyad=scan.nextLine();//next methodu sadece space'e kadar olan kısmı alır
        //space in index ini bulurum
        //0 dan spaceIndex e kadar olan kismi substring ile alirim
        int spaceIndex=adSoyad.trim().indexOf(" ");
        //substring methodunun iki formu var
        //1. substring(index)==> yazilan index ten stringin sonuna kadar olan kismi string olarak dondurur
        //deniz.substring(3)==> iz
        //1. substring(index1,index2)==> index1 dahil, index2 hariç olmak uzere index1den index2 ye
        // kadar olan kısım string olarak doner
        //deniz.substring(2,4)==> ni
        String ad=adSoyad.trim().substring(0,spaceIndex);
        String soyad=adSoyad.trim().substring(spaceIndex+1);
        System.out.println("Ad = " + ad);
        System.out.println("Soyad = " + soyad);

        char adIlkHarf=ad.toUpperCase().charAt(0);
        String adKalani= ad.substring(1).toLowerCase();
        ad=adIlkHarf+adKalani;
        char soyadIlkHarf=soyad.toUpperCase().charAt(0);
        String soyadKalani= soyad.substring(1).toLowerCase();
        soyad=soyadIlkHarf+soyadKalani;
        System.out.println("Ad: "+ad);
        System.out.println("Soyad: "+ soyad);

        /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi aralarinda bosluk olacak sekilde yaziniz");
        String isimSoyisim = input.nextLine();

        int spaceInd = isimSoyisim.indexOf(" ");

        String isim=isimSoyisim.substring(0,spaceInd ).toUpperCase();
        char isimIlk=isim.charAt(0);
        String isimKalan=isim.substring(1).toLowerCase();

        String soyisim=isimSoyisim.substring(spaceInd+1).toUpperCase();
        char soyisimIlk=soyisim.charAt(0);
        String soyisimKalan=soyisim.substring(1).toLowerCase();
        System.out.println(isimIlk + isimKalan);
        System.out.println(soyisimIlk + soyisimKalan);


    }//Main
}//Class
