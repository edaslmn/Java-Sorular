package odev41_50;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {

 /*43----
    Girilen kelimedeki alfabeye göre ard arda gelmeyen harfleri bulunuz. (İngilizce alfabeye göre).
    Eğer herhangi atlanan bir harf yoksa "Sıralı Harfler" yazdıralım.


    Örnekler

    kayipHarfler("abdefg")
    Çıktı : c

    kayipHarfler("mnopqs")
    Çıktı : r

    kayipHarfler("abcdefgh")
    Çıktı : Sıralı Harfler

    ilk örnekte :  /// b harfinden sonra c gelmemiş
    ikinci örnekte : /// p harfinden sonra r gelmemiş
    */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sıralı harfler giriniz: ");
        String harfler = scan.next().toLowerCase();

        boolean kontrol = true;

        for (int i = 0; i < harfler.length()-1; i++) {
            if (harfler.charAt(i) + 1 != harfler.charAt(i+1)){
                System.out.println(harfler + " " + (Character.toString(harfler.charAt(i)+1)));
                kontrol = false;
                break;
            }


        }

        if(kontrol){
            System.out.println("sıralı harfler");
        }

    }
}
