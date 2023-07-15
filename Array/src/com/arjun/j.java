package com.arjun;

public class j {
    public static void main(String[] args) {
        int[] arr = {3,5,6,2,4,9,10,8,7};
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            flag = 0;
            for (int j = 2; j <arr[i] ; j++) {
                if (arr[i]%j==0){
                    flag =1;
//                    System.out.println(arr[i-1]);
                }
            }
            if (flag < 1 && i!=0){
                System.out.println(arr[i-1]);
            }
//            else System.out.println("Not prime");
        }
    }
}
