package day02;

public class C05_MethodCreation {
     /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn: sayi1=10 ve sayi2=20;
              kod calistiktan sonra
              sayi1=20 ve sayi2=10
         */
     public static void main(String[] args) {
         int sayi1=10;
         int sayi2=20;

         System.out.println("Swaptan once sayi1 :"+ sayi1);
         System.out.println("Swaptan once sayi2 :"+ sayi2);

         //methodum; iki sayinin degerlerini degistirip yazdiracak ==> return type:void

         swaplaYazdir (sayi1,sayi2);

     }//Main
    public static void swaplaYazdir(int sayi1, int sayi2) {
         int sayi3;
         sayi3=sayi1;
         sayi1=sayi2;//sayi1=20
         sayi2=sayi3;//sayi2=10
         System.out.println("Swaptan sonra sayi1 :"+ sayi1);
         System.out.println("Swaptan sonra sayi2 :"+ sayi2);
    }
}//Class
