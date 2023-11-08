package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.io.File;
import java.util.stream.IntStream;


@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);

//        تابعی بنویسید که یک عدد صحیح را به عنوان ورودی می گیرد و تعداد بیت هایی را که در نمایش باینری آن عدد برابر با یک هستند برمی گرداند. می توانید تضمین کنید که ورودی غیرمنفی است.
//
//        مثال : نمایش باینری از 1234است 10011010010، بنابراین تابع باید 5در این مورد برگردد

//        assertEquals(5, BitCounting.countBits(1234));
//        assertEquals(1, BitCounting.countBits(4));
//        assertEquals(3, BitCounting.countBits(7));
//        assertEquals(2, BitCounting.countBits(9));
//        assertEquals(2, BitCounting.countBits(10));

        int input = 1234;
        int result = Binery.level1(input);
        System.out.println("Number of ones in the binary representation of " + input + " is: " + result);




    }


}
