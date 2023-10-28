package com.example.demo;

import java.util.stream.IntStream;

public class evenANDodd {

    public static String level1(int[] number) {

        int sum = 0;

//        for (int i = 0; i < number.length; i++) {
//            sum += number[i];
//        }

        for (int num : number) {
            sum += num;
        }


//        if (sum % 2 == 0) {
//            return "even";
//        } else {
//            return "odd";
//        }

        return sum % 2 == 0 ? "even" : "odd";

    }

    public static String level2(int[] number) {
//        return stream(number).sum()%2==0?"even":"odd";
//        return Arrays.stream(number).sum() % 2 == 0 ? "even" : "odd";
        return (IntStream.of(number).sum()&1)==1?"odd":"even";
    }
}
