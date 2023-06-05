package day02;

public class C05_MethodCreationTekrar {
    public static void main(String[] args) {
         /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP) ve yazdiran
        bir method yaziniz
          Orn : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
          sayi1=20 ve sayi2=10
         */

        int num1=111;
        int num2=222;
        System.out.println("Swaptan once num1 = "+num1);
        System.out.println("Swaptan once num2 = "+num2);
        swapYap(num1, num2);

    }//Main
    public static void swapYap(int num1,int num2){
        int num3;
        num3=num1;
        num1=num2;
        num2=num3;
        System.out.println("Swaptan sonra num1= "+num1);
        System.out.println("Swaptan sonra num2= "+num2);
    }
}//Class
