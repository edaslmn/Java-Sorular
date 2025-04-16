package odev41_50;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {

 /*45-----
    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden bir program yazınız.

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("email giriniz: ");
        String email = scan.nextLine();

        System.out.println(emailKontrol(email));

    }

    public static boolean emailKontrol (String email){

        boolean sonuc = false;

        if(email.contains("@") && email.contains(".") && email.charAt(0) != '@' && !email.startsWith(" ") ){
            sonuc = true;
        }

        return sonuc;
    }

}
