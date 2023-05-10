package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non-primitive data type dir ve ayni zamanda bir classdir.

        String s = "Java is easy";

        //Ornek 1: "s" String indeki tum characterleri buyuk harf yapiniz.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA İS EASY

        //Ornek 2: "s" String indeki tum characterleri kucuk harf yapiniz.
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Ornek 3: "s" String indeki ilk characteri aliniz
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Ornek 4: "s"  Stringindeki ikinci ve sondan ikinci characteri aliniz ve ekrana yazidiriniz
        char secondChar =s.charAt(1);//a
        char secondLastChar = s.charAt(10);//s
        System.out.println(""+secondChar+secondLastChar);

        //Ornek 5: "s" String inde kullanilan toplam character sayisini bulunuz
        int sLength = s.length();
        System.out.println(sLength);//12

        //Ornek 6: "s" Stringindeki ilk dort characteri aliniz
        //substring(0,4) ==>  ilk index dahil,  ikinci index dahil degil

        String sub1   =  s.substring(0,4);
        System.out.println(sub1);//Java

        //Ornek 7: "s" Stringindeki "is" kelimesini aliniz
        String sub2=s.substring(5,7);
        System.out.println(sub2);//is

        //Ornek 8: "s" Stringindeki "easy" kelimesini aliniz
        String sub3=s.substring(8,12);
        System.out.println(sub3);//easy

        //ikinci yol
        //Bir character den baslayip String in sonuna kadar almak isterseniz, ikinci indexi yazmayiniz
        //substring(8,12); yerine substring(8); yazdik boylece baslangic indexinden itibaren sonuna kadar aldik
        String sub4= s.substring(8);
        System.out.println(sub4);//easy

        //Ornek 9: "s" String inde "money" kelimesinin var olup olmadigini kontrol ediniz
        boolean isExist= s.contains("money");//false
        System.out.println(isExist);

        //Ornek 10: "s" String inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        //Ornek 11:  "s" String inin 6. characterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.
        //soru : 5. index dahil olmak uzere i karakteri ile baslayip baslamadigini kontorl eden kodu yaziniz
        boolean isBegin =s.startsWith("i",5);
        System.out.println(isBegin);//true

    }


}
