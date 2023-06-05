package day01;

public class C04_MethodCreation {
    //konsola;
        /*

        hello world
        Hello World
        HEllo WOrld
        HELlo WORld
        HELLo WORLd
        HELLO WORLD
        yazdırın
         */
    public static void main(String[] args) {
         yazdir(); //asagida tanimladigim "yazdir" method um 6 defa "hello world" yazdiracak sekilde kodlandi.
         yazdir(); //burada 3 defa yazdir methodumu çalıstırdigim zaman console da 18 defa hello world yazacak
         yazdir(); // main method içinin bu şekilde temiz olması(18 kere tek tek yazmadk==> bunu hatırla) clean kod ol ifade edilir
    }//main method

     //syntax : access modifier + static (key word) + return type + method ismi + () + {}

     /*static ==> method un static oldugunu belirtir
     return type: method un veri dondurup dondurmeyecegini belli eder. void olursa bize veri dondurmez.
     farklı bir degerse mesela integer se bize ınteger bir deger dondurur.
     {} süslü parantez body kısmıdır. esas kodları body e yazarız
      */

        public static void yazdir(){
            System.out.println("hello world");
            System.out.println("Hello World");
            System.out.println("HEllo WOrld");
            System.out.println("HELlo WORld");
            System.out.println("HELLO WORLD");

    }//yazdir method um


}//Class
