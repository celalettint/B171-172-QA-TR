package day14loops;

public class Loops01 {
    public static void main(String[] args) {
        //Ornek: Bir String i ters ceviren kodu yaziniz
        // "Java" ==> "avaJ"

        //1. Yol
        //          "Java";
        String t = "Java";
        String ters = "";

        for (int i = t.length() - 1; i >= 0; i--) {
            ters = ters + t.substring(i, i + 1);
            // System.out.println("loop ici==>"+ters);
        }
        System.out.println(ters);

        //2. yol
        String u = "Java";
        String ters2 = "";

        for (int i = u.length() - 1; i >= 0; i--) {
            ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters2);

        //Ornek 2 Size verilen bir string in palindrome olup olmadigini kontrol eden kodu yaziniz
        //         ey edip adanada pide ye , nalan, kucuk, ada
        //Logic : String i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise Palindrome dur.
        String duz = "Ey edip adanada pide ye";
        String ters3 = "";

        for (int i=duz.length()-1 ; i>=0; i--  ){
            ters3=ters3+duz.charAt(i);
        }
        System.out.println(ters3);

        if(duz.equalsIgnoreCase(ters3)){
            System.out.println("Palindrome dur");
        }else{
            System.out.println("Palindrome degildir");
        }



    }
}
