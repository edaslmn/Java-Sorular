package odev41_50;

import java.util.Scanner;

public class Soru_2_ {
    public static void main(String[] args) {

            /*42----
    İki farklı kelimeyi birleştirip, ilk harfini büyük kalan harfleri
    küçük yapan bir method yazınız.

    Örnekler
    getKelime("kal", "em") ? "Kalem"
    getWord("gözl", "emlemek") ? "Gözlemlemek"
    getWord("zor", "luk") ? "Zorluk"
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki tane hece giriniz: ");
        String obek1 = scan.next();
        String obek2 = scan.next();

        System.out.println(getWord(obek1, obek2));
    }

    public static String getWord (String obek1, String obek2){

        String kelime = obek1.substring(0,1).toUpperCase() + obek1.substring(1).toLowerCase() + obek2.toLowerCase();
        return kelime;
    }
}
