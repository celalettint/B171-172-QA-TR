package day05concatinationoperatortypecasting;

public class Operators {
    /*
    1) +,-,*,/ islemleri java da matematik te kullanildigi gibi kullanilir
        Note 1: int / int ==> int olur
        Nate 2: double + int ==> double olur.
        Cunku; javada matematiksel islemlerde farkli data type lari kullanilirsa sonuc her zaman buyuk data type inda olur

    2) Java da "Logical Operator" lar vardir. AND ve OR islemleri "Logical Operator" lardir
        i) AND (&&) isleminden true alabilmek icin her sey true olmalidir.
           AND islemi "perfectionist"tir.
           AND isleminde bir tane bile false sonucu false yapar

       ii)  OR (||) isleminde bir tane true sonucu true yapmaya yeter
            OR isleminde sonucun false olmasi icin hersey false olmalidir
            OR islemi "polyanna" gibidir.

       iii) NOT operator (!) true olani false, false olani true yapar.
            !true => false
            !false => true
            !!true => true

    3) Comparison (Karsilastirma) Operators
            <, >, <=, >=, ==, !=
        Note: Karsilastirma operatorlarini kullandiginizda KESINLIKLE boolean (true veya false) alirsiniz
        Note: Biz AND islemi icin && kullaniriz  & kullanim da gecerlidir
              Farklari nedir?
              "&&" kullanim ilk ifade "false"  oldugunda digerlerini kontrol etmez, dolayisiyla hizli calisir
              cunku and isleminde ilk ifade false ise digerlerinin ne oldugunun bir onemi yoktur sonuc false olur
              "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir
              Biz bu yuzden hep "&&" kullaniriz

     */
    public static void main(String[] args) {
       boolean first = 3<5;
       boolean second =2+3!=5;
       boolean third = 2+3*5>=19;
        System.out.println(first + "-"+second+"-"+third);//true-false-false

        System.out.println(first && second);//false
        System.out.println(first || second || third);//true

    }

}
