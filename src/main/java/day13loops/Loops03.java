package day13loops;

public class Loops03 {
    public static void main(String[] args) {
        //Ornek 1 : Verilen bir string de kucuk harfleri console a yazmayiniz
        //"Pwd12?Ab" ==> P12?A

        String s = "Pwd12?Ab";

        for (int i = 0; i < s.length();                              i++) {

            char ch = s.charAt(i);

            if(ch>='a' && ch <='z'){//kucuk harfleri sectim
                continue;
            }
                System.out.print(ch);

        }

        // "break" ile "continue" arasindaki fark nedir?
        //  "break" switch in disina cikmak icin ve loop u kirmak icin kullanilir
        // "continue" ise loop yaparken bazi elemanlari isleme sokmamak icin kullanilir
        // continue keywordu bir looptaki gecerli iteration i sonlandirip sizi artirma/azaltma bolumune goturur.

    }
}
