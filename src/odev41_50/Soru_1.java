package odev41_50;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {

     /*41-----
    Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.
    (diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).

    Örnek
    makeTitle("Bu bir başlıktır")
    Bu Bir Başlıktır

    makeTitle("tüm ilk harfler büyük olacak")
    Tüm İlk Harfler Büyük Olacak
    */


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz: ");
        String metin = scan.nextLine();
        String[] arr = metin.split(" ");
        System.out.println("String metin Array'e çevrildi. " + Arrays.toString(arr));
        String edit = "";

        for (int i = 0; i < arr.length; i++) {
            edit += arr[i].substring(0,1).toUpperCase()+arr[i].substring(1) + " ";

        }
        System.out.println("Girilen metnin düzenlenmiş hali: " + edit);
}
 }