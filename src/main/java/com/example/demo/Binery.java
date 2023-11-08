package com.example.demo;

public class Binery {


    public static int level1(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;


    }



    public class level2 {

        public static int countBits(int n){

            return Integer.bitCount(n);
        }

    }

    public class level3 {

        public static int countBits(int n){
            int ret = n % 2;
            while ((n /= 2) > 0) ret += n % 2;
            return ret;
        }

    }

    public class level4 {

        public static int countBits(int n){
            return (int) Integer.toBinaryString(n).chars()
                    .filter(c -> c == '1')
                    .count();
        }

    }


    public class level5 {

        public static int countBits(int n){
            // Show me the code!
            int num = Integer.bitCount(n);
            return num;
        }
    }
    public final class level6 {

        public static int countBits(int n) {
            int i = 0;

            for (int j = n; j > 0; j >>= 1) {
                i += j & 1;
            }

            return i;
        }
    }
    public class level7 {

        public static int countBits(int n) {
            return Integer.toBinaryString(n).replaceAll("0","").length();
        }
    }


    class level8 {
        static int countBits(int n) {
            return Integer.bitCount(n);
        }
    }


    public class level9 {

        public static int countBits(int n){
            String s = Integer.toBinaryString(n);
            return  s.length() - s.replace("1", "").length();
        }

    }
}
