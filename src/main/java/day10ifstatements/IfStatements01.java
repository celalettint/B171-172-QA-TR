package day10ifstatements;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        //Ornek: Verilen bir sayinin pozitif, negatif yada notr oldugunu kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num = input.nextInt();

        if (num>0){
            System.out.println("Pozitif");
        } else if (num<0) {
            System.out.println("Negatif");
        }else  {
            System.out.println("Notr");
        }


    }
}
