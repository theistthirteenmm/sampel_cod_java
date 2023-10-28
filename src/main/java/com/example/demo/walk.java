package com.example.demo;

import java.awt.*;

public class walk {

    public static boolean level1(char[] walk) {

        if (walk.length != 10) {
            return false;
        }

        int x = 0;
        int y = 0;

        for (char direction : walk) {
            switch (direction) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'e':
                    x++;
                    break;
                case 'w':
                    x--;
                    break;

            }


        }

        return x == 0 && y == 0;

    }

    public static boolean level2(char[] walk) {

        if (walk.length != 10) return false;
        int n = 0, s = 0, e = 0, w = 0;
        for (char ch : walk) {
            if (ch == 'n') n++;
            if (ch == 's') s++;
            if (ch == 'e') e++;
            if (ch == 'w') w++;
        }
        if (n == s && e == w) return true;
        else return false;
    }

    public static boolean level3(char[] walk) {
        Point point=new Point(0,0);
        for (char ch:walk) {
            switch (ch){
                case 'n':point.translate(1,0);break;
                case 's':point.translate(-1,0);break;
                case 'e':point.translate(0,1);break;
                case 'w':point.translate(0,-1);break;
            }
        }
        return point.equals(new Point(0,0))&&walk.length==10;
    }


}
