package odev41_50;

import java.util.Scanner;

public class Soru_7 {
    public static void main(String[] args) {

         /*47----
    Ortadaki harfi alabileceğimiz bir program yazın.
    Eğer harf sayısı 2 nin katına eşitse,
    ortadaki 2 harfi alın, diğer durumda ortadaki 1 harfi alın.

    Examples

    ortadakiHarf("test")
    Çıktı : es
    ortadakiHarf("testing")
    Çıktı : t
    ortadakiHarf("middle")
    Çıktı : dd
    ortadakiHarf("A")
    Çıktı : A
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("kelime girniz: ");
        String kelime = scan.next();
        int uzunluk = kelime.length();
        int orta = kelime.length()/2;

        if(uzunluk%2==0){
            System.out.println(kelime.charAt(orta-1) + "" + kelime.charAt(orta));

        }else {
            System.out.println(kelime.charAt(orta));
        }

    }
}
