package com.example.test;

import sharma.priyanshu.mylibrary.Series;

public class Main {

    public static void main (String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println (Series.nSum (i));
        }

        System.out.println ("*".repeat (20));

        for (int i = 0; i <= 10; i++) {
            System.out.println (Series.factorial (i));
        }

        System.out.println ("*".repeat (20));

        for (int i = 0; i <= 10; i++) {
            System.out.println (Series.fibonacci (i));
        }
    }
}
