package day13loops;

public class Loops01 {
    public static void main(String[] args) {

        //Ornek 1: Ekrana 5 kere "Hi" yazdiriniz

        //1. Yol tavsiye edilmez
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");

        /*
         Code Standarts
         1) Tekrar (Repetition) olmamalidir
         2) Dynamic olmalidir
         3) Tamir (Fix) ve update kolay yapilabilmelidir.
         */

        //2 yol
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" lar kullanilir
        //Dort tane loop var a) for-loop b) while-loop c) do-while-loop d) for-each loop

        //a) for - loop
        /*
        for(Baslangic Degeri      ; Loop un calisma sarti   ;  Artirma/Eksiltme     ){
            //calisacak kodlar
        }
        *///i=i+i /  i+=1 / i++
        //Baslangic Degeri      ; Loop un calisma sarti   ;  Artirma/Eksiltme

        for(   int i =    1     ;     i<6                 ;      i++           ){
            System.out.println("Hi");
        }

        //Ornek 2: 11 den 14 e kadar tum sayilari ekrana yazdiran kodu yaziniz

        for( int i= 11   ;       i<15     ;                    i++    ){
            System.out.println(i);
        }

        //Ornek 3: 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz.
        for(int i =40  ; i>22   ; i--  ){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //Ornek 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz.
        for( int i=18   ; i<57  ; i++  ){
            if(i%2!=0){
                System.out.print(i+" ");
            }

        }

    }
}
