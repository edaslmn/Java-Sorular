package odev41_50;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {

         /*42----
    İki farklı kelimeyi birleştirip, ilk harfini büyük kalan harfleri
    küçük yapan bir method yazınız.

    Örnekler
    getKelime("kal", "em") ? "Kalem"
    getWord("gözl", "emlemek") ? "Gözlemlemek"
    getWord("zor", "luk") ? "Zorluk"
    */

        kelimeOlustur("dü", "sün", "mek");
    }



    public static void kelimeOlustur (String... ksm){

        String kelime = "";
        for (int i = 0; i < ksm.length; i++) {

            kelime += ksm[i];

        }
        System.out.println(kelime.substring(0,1).toUpperCase() + kelime.substring(1));

    }


}
