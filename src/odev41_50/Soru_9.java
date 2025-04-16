package odev41_50;

import java.util.Scanner;

public class Soru_9 {
    public static void main(String[] args) {


    /*49-----
    Fazla mesaiyi hesaplayan bir program yazınız.
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("başlama saatini yazınız: ");
        double start = scan.nextDouble();
        System.out.println("bitiş saatini yazınız: ");
        double finish = scan.nextDouble();
        System.out.println("saatlik çalışma ücretini yazınız: ");
        double ucret = scan.nextDouble();
        System.out.println("fazla mesai çarpanını yazınız: ");
        double mesai = scan.nextDouble();


        System.out.println(ucretHesapla(start, finish, ucret, mesai));

    }

    public static double ucretHesapla(double start, double finish, double ucret, double mesai){

        double toplamUcret = (finish - start)*ucret;

        if(start < 9){
            toplamUcret += (9.00 - start) * ucret*mesai;

        }

        if (finish > 17.00){
            toplamUcret += (finish - 17.00) * ucret * mesai;
        }

        return toplamUcret;



    }

}

