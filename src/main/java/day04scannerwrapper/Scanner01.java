package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Ornek: Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz.
        //1.adim:Scanner class tan bir object olustur
        Scanner input = new Scanner(System.in);
        //2.adim: Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("ilk ismini giriniz..");
        //3.adim :Uygun methodu kullanarak kullanicinin verdigi datayi memory e yerlestiriniz
        //next() methodu kullanicidan" tek kelimeli string" almak icin kullanilir
        String firstName = input.next();

        System.out.println("Soy isminizi giriniz...");
        String lastName = input.next();

        System.out.println(firstName+" "+lastName);

    }
}
