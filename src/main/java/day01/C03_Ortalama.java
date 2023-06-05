package day01;

public class C03_Ortalama {

    /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */

    public static void main(String[] args) {

        double num1 =23.4;
        double num2 =24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

        // double data turunde ismi toplam olan bi variable olusturalım
        // ve bu  variable ye yazdıgımız 5 sayının toplamını assign edelim (atayalım)

        double toplam = num1 + num2 + num3 + num4 + num5;  // sayısal yani numerik data larda + isareti matematiksel toplama işlemi yapar
                                                            // ama String ler de yan yana yazdırır

        System.out.println("toplam = " + toplam); //609.7

        //ortalama = toplam / sayı adedi
         double ortalama = toplam / 5;
        System.out.println("ortalama = " + ortalama); //121.94000000000001
    }
}
