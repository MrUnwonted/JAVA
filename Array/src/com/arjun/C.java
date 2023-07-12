package com.arjun;

public class C {
    public static void main(String[] args) {
        String s = "malayalam";
        char c = 0;
        char e = 0;
        boolean t = true;

        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i -1)) {
                t = false;
            }
        }

        if (t) System.out.println("palindrome");
        else System.out.println("Not palindrome");
    }
}