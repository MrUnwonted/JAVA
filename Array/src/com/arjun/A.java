package com.arjun;

public class A {
    public static void main(String[] args) {
        String s = "ARJUN";
        String c = "";

        for (int i = s.length()-1; i >-1 ; i--) {
             c += s.charAt(i);

        }
        System.out.println(c);
    }
}
