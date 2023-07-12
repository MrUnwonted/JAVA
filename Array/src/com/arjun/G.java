package com.arjun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class G {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("Array");

        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(11);
        list.forEach(System.out::println);

        list.remove(1);
//        int i = 0;
//        list.get(i) ;

        list.forEach(System.out::println);

        System.out.println("Delete");

        int[] arr = {2,3,5,4,11};
        int pos = 1;
        int n = arr.length;
        for (int i = pos; i < arr.length - 1 ; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;

        for (int i = 0; i < arr.length - 1 ; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
