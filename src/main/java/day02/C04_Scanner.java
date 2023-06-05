package day02;

import java.util.Scanner;

public class C04_Scanner {

    //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen bir karakter giriniz");
            char ch = input.next().charAt(0);
            //Scanner object inin nextChar diye bir methodu yok bu yuzden kullanicinin girdigi datayi once string ol aliyorum
            //daha sonra bu string in 0. index indeki karakteri charAt(0) methodu ile aliyorum
            //String variable larda index yapisi vardir ve index 0 dan baslar.
            //charAt(0) => 0. index yani ilk karakter demektir.
            System.out.println("ch = " + ch);
            System.out.println(" ====================================CEVAP=========================");
            /*
              A
             A A
            A A A
             */
        //Konsolda bosluk (space) yapmak icin sout un icinde  space i mutlaka "" yazmaliyiz.
            System.out.println("  "+ch+"  ");//satir
            System.out.println(" "+ch+" "+ch+" ");
            System.out.println(ch+" "+ch+" "+ch);

            System.out.println("=====================================CEVAP2================================");
            // \n isareti bir alt satira gecmeye yarar. ""icinde yazilir
            System.out.println("  "+ch+"\n "+ch+" "+ch+"\n"+ch+" "+ch+" "+ch);




        }//main
}//Class
