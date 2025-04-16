package odev41_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_8 {
    public static void main(String[] args) {


    /*48-----
    İki farklı Array'i birleştiren bir program yazınız.

    Örnekler:

    birlestir([1, 3, 5], [2, 6, 8])
    Çıktı : [1, 3, 5, 2, 6, 8]

    birlestir([7, 8], [10, 9, 1, 1, 2])
    Çıktı : [7, 8, 10, 9, 1, 1, 2]

    birlestir([4, 5, 1], [3, 3, 3, 3, 3])
    Çıktı : [4, 5, 1, 3, 3, 3, 3, 3]
    */


       Integer[] arr1 = {5,6,7,8};
       Integer[] arr2 = {4,8,7};
       List<Integer> liste = new ArrayList<>();
       liste.addAll(Arrays.asList(arr1));
       liste.addAll(Arrays.asList(arr2));
       System.out.println(liste);




        }

    }

