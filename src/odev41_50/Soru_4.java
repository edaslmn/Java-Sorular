package odev41_50;

import java.util.Scanner;

public class Soru_4 {
    public static void main(String[] args) {

         /*44----
    String içindeki birden fazla geçen karakter sayısını bulan program yazınız.
     Mesela "Merhaba" kelimesinde sadece a harfi tekrar ettiği için
     bu String için sonuç 1 olacak.
     Eğer herhangi tekrar eden bir harf yoksa 0 sayısını döndersin program.

    Örnekler:
    duplicates("Hello World!")
    Çıktı : 2
    duplicates("foobar")
    Çıktı : 1
    duplicates("helicopter")
    Çıktı : 1
    */


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir kelimegiriniz: ");
        String str = scan.nextLine();
        int sayac = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    sayac++;
                }
            }


        }

        System.out.println(sayac);

    }
}
