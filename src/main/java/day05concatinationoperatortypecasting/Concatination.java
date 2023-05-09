package day05concatinationoperatortypecasting;

public class Concatination {
    public static void main(String[] args) {

        //Ornek 1: Bir string ve iki int variable olusturun. String degeri ile int lerin toplamini console a yazdiriniz
        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s +  a  +    b);//elma1011
        System.out.println(s + (a +  b ));//elma21
        System.out.println(s + a * b);//elma110
        System.out.println(a + b + s);//21elma
        System.out.println(a + s + b );//10elma11

        // Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        //Java da "+" sembolu iki string arasinda veya bir string ve bir sayi arasinda kullanilirsa concatination islemi olur
        //concatination islemi birlestirme yapar
        //Note: Concatination islemlerinde java matematikte ki islem onceligi kurallarini kullanir

        /*
        1) Once uslu sayilar
        2) Parantez ici islemler yapilir
        3) Carpma ve bolme islemleri yapilir
        4) Toplama ve cikarma islemleri yapilir
        5) Ayni oncelikli olanlarda soldan saga baslanir
         */

        //Ornek 2: Size string olarak verilen iki fiyatin toplamini ekrana yazdiriniz
        String shirt = "2300";
        String shoes ="5200";
        System.out.println(shirt+shoes);//23005200

        //Integer.valueOf() string degerleri integer a cevirir
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //Ornek 3: Size string olarak verilen iki fiyatin toplamini ekrana yazdiriniz
        String tv = "$1100";
        String radio = "$300";
        System.out.println(tv+radio);//$1100$300


        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);
        //Note :valueOf() methodu tum karakterleri rakam olan Stringleri sayilara cevirir
        //Eger valueOf() methodu kullanilirken String in icine rakam olmayan bir karakter koyarasaniz hata alirisiniz
        //bu tarz hatalari duzeltmeyi ilerleyen derslerimizide ogrenecegiz
        //valueOf() methodu kullanilirken sadece rakam olan karakterler kullanilmalidir

    }

}
