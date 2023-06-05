package day01;

public class C05_MethodCreation {
    public static void main(String[] args) {
       int sonuc = karelerToplami(5,6);
        System.out.println("sonuc = " + sonuc);

    }//main method

    //iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz

    // main methodun içinde tanimladigim iki sayinin kareleri toplamını bulan ve yazdıran bir method oluşturun
    public static int karelerToplami ( int a, int b) {
        return ((a * a) + (b * b));
    }
}//class
