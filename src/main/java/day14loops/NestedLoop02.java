package day14loops;

import java.util.Scanner;

public class NestedLoop02 {
    public static void main(String[] args) {
/*              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */

        Scanner input = new Scanner(System.in);

        System.out.println("Satir (row) sayisini giriniz..");
        int row = input.nextInt();

        System.out.println("Sutun (column) sayisini giriniz..");
        int column = input.nextInt();


        for (int i = 1; i <= row; i++) {//dıstaki loop satirlar icin satir sayisi kadar calisir

            for (int k = 1; k <= column; k++) {//icteki loop yan yana yazdigindan sutunlar icin sutun sayisi kadar calisir

                System.out.print("x ");

            }
            System.out.println();                   //ilk satir yanyana yazdirildiktan sonra pointeri bir sonraki satira almak icin

        }

    }
}
