package day01;

public class C01_Variables {

    public static void main(String[] args) {

        //Bir variable olustur, yazdır
                        int                     yas             =               36;
        //syntax : variables data turu + variable isim + atama operatoru  +  variable deger
        int sayi = 50;

        System.out.println(yas); //ctrl d ile satırı alt alta cogaltabiliriz.
        System.out.println(yas); //=>> dynamic kod. içine 35 yazsak tek tek değiştirmek zorunda kalacaktık
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);

        //sayi = 50 seklinde yazdır
        System.out.println("sayi = "+sayi);
        //bu şekilde yazdırmaya sayi variable ini etiketiyle birlikte yazdirma denir
        //ctrl alt L ==> dagınık kodlarımızı hizalamaya (duzenlemeye) yarar
        //bir variable ı etiketiyle birlikte  yazdırmanın kısa yolu ==> soutv
        System.out.println("sayi = " + sayi);//etiketli
        System.out.println(sayi);//etiketsiz
        System.out.println("yas = " + yas);

        //string bir variable olusturalim. ==> non*primitive data turu, ""icinde yazilir, buyuk harfle baslar
        String isim = "Ali";

        // isim variable ını etiketiyle birlikte yazdır
        System.out.println("isim = " + isim);

        //Olusturdugun variable'ı farkli bir variable'a kopyala
        // yeni bir variable olusturacagim: benimYasim ve bu variable ın degeri yas variablenın degerine esitle
        // benimYasim variable nin degeri de yas variable gibi 36 olsn
        int benimYasim = yas;

        //onunIsmi variable nın degeri "Ali " olsun (ama Ali ismini kullanma) ve bunu kopyalama işlemiyle yapalim
        String onunIsmi= isim; //bu sepet old için ".." içinde yazmadk
        System.out.println("onunIsmi = " + onunIsmi);

        //camelCase
        //PaskalCase
        //snake_case
        //kebab-case

        //Aynı satırda coklu variable deklare et yıl ay gun
        int yil=2023, ay=5, gun=15;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);


        //Bir variable degerini guncelle
        // az once olusturdugumuz isim varibale nın degerini Veli olarak guncelle
        isim = "Veli";
        System.out.println("isim=" +isim);
        System.out.println("onunIsmi" + onunIsmi);
        //java yukarıdan asagı ve soldan saga calısır


        //Degişkenleri(variable) yazdır==> atladk

        //Bir variable deklere et : x ==> deger ataması yapmak zorunda değiliz
        double x;                   // declare etmek = tanımlamak ==> data turu + data ismi

        //Bir variable baslat : y ==>baslat demek deger ataması yap demek
        double y = 12.5;

        //Başka bir variable başlat : z
        double z = 33; // java buraya yazdıgımız 33 degerini 33.0 olarak algıladı ve hata vermedi


        //x degişkenini y degişkeni ile başlat
        x = y; // bir variable bir scope (main method) da sadece bir kez declare edilebilir


        //Variable y'i guncelle
        y = 13.9; // ondalikli sayilarda . kullanırız

        //Degişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }





}
