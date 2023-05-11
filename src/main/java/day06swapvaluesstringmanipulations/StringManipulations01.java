package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non-primitive data type dir ve ayni zamanda bir classdir
        String s = "Java is easy";

        //Ornek1: "s" Stringindeki tum characterleri buyuk harf yapiniz
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA İS EASY

        //Ornek2:"s" Stringindeki tum characterleri kucuk harf yapiniz
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Ornek3: "s" String'indeki ilk characteri aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Ornek4: "s" string'indeki bastan ikinci ve sondan ikinci characteri aliniz ve ekrana yazdiriniz
        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);
        System.out.println("" + secondChar + secondLastChar);//as

        //Ornek 5: "s" string'inde kullanilan character sayisini bulunuz
        int sLength = s.length();
        System.out.println(sLength);//12

        //Ornek 6: "s" String'indeki ilk 4 characteri aliniz
        // s.substring(0,4) ==> bu kullanimda ilk index dahildir, ikinci index harictir.
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);//Java

        //Ornek7: "s" String'indeki "is" kelimesini aliniz
        String sub2 = s.substring(5, 7);
        System.out.println(sub2);//is

        //Ornek8: "s" String'indeki "easy" kelimesini aliniz
        String sub3 = s.substring(8, 12);
        System.out.println(sub3);//easy

        //ikinci yol
        String sub4 = s.substring(8);
        System.out.println(sub4);//easy

        //Ornek 9:  "s" String'inde "money" kelimesinin var olup olmadigini kontrol ediniz
        boolean isExist = s.contains("money");
        System.out.println(isExist);

        //Ornek 10:  "s" String'inin belli bir harf yada harflerle baslayip baslamadigini kontrol ediniz
        boolean isStart=s.startsWith("Java");
        System.out.println(isStart);

        //Ornek 11: "s" String inin 5. index dahil olmak uzere bu indexten itibaren "i" karakteri ile baslayip baslamadigini
        //kontrol eden kodu yaziniz
        boolean isBegin=s.startsWith("i",5);
        System.out.println(isBegin);//true


    }
}
