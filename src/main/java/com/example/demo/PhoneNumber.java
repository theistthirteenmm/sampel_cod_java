package com.example.demo;

import java.util.stream.IntStream;

public class PhoneNumber {

//    int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//    level1(number);
//    level2(number);
//    level3(number);
//    level4(number);

    public static void level1(int[] number) {
        String sot = null;

        for (int i = 0; i < number.length; i++) {

            if (i == 0) sot = "(";
            if (i <= 2) sot += number[i];
            if (i == 2) sot += ") ";
            if (i > 2 && i <= 5) sot += number[i];
            if (i == 5) sot += "-";
            if (i > 5) sot += number[i];

        }

        System.out.println("level 1 =="+sot);

    }

    public static void level2(int[] number) throws IllegalAccessException {

        if (number.length != 10) {
            throw new IllegalAccessException("مقدار آرایه نادرست است");
        }

        String phoneNumber = String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                number[0], number[1], number[2],
                number[3], number[4], number[5],
                number[6], number[7], number[8], number[9]
        );

        System.out.println("level 2 =="+phoneNumber);

    }


    public static void level3(int[] number){

        String phonenumber=new String("(xxx) xxx-xxxx");

        for (int i : number) {
            phonenumber =phonenumber.replaceFirst("x",i+"");
        }
        System.out.println("level 3 =="+phonenumber);
    }


    public static void level4(int[] number){
        System.out.println("level 4 =="+String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(number).boxed().toArray()));

    }
}
