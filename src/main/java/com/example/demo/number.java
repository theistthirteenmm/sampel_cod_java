package com.example.demo;

public class number {
    public static String laval1(int num){
        String numStr=Integer.toString(num);
        StringBuilder resalt =new StringBuilder();

        for (int i = 0; i <numStr.length() ; i++) {
            int digit=Character.getNumericValue(numStr.charAt(i));
            if (digit!=0){
                if (resalt.length()>0){
                    resalt.append("+");
                }
                resalt.append(digit*(int) Math.pow(10,numStr.length()-1-i));
            }
        }
        return resalt.toString();

    }


    public static String laval2(int num){
        String outs="";
        for (int i = 10; i <num; i*=10) {
            int rem=num%i;
            outs=(rem>0)?"+"+rem+outs:outs;
            num -= rem;
        }
        outs=num+outs;
        return outs;
    }

    public static String laval3(int num){
        String numStr=Integer.toString(num);
        StringBuilder a = new StringBuilder();
        String ziro="0";
        for (int i = 0; i <numStr.length() ; i++) {

            int digit=Character.getNumericValue(numStr.charAt(i));
            if (digit != 0 ){
                if (i==numStr.length()-1){
                    a.append(digit); break;}
                a .append(digit);
                for (int j = numStr.length()-1; j >i ; j--) {
                    a.append(ziro);
                }

                a.append("+");
            }

        }
        return a.toString();
    }

    public static String level4(int num)
    {
        String s= Integer.toString(num);
        String n="";int c=1;
        for (int i = 0; i < s.length(); i++) {
            {
                if(s.charAt(i) != '0')
                    n+=s.charAt(i) + "0".repeat(s.length()-c) + " + ";
                c++;
            }
        }
        return n.substring(0, n.length()-3);
    }

    public static String lavel5(int num){
        String[] numStr = String.valueOf(num).split("");
        String result = "";
        int zeros = numStr.length - 1;
        for (int i = 0; i < numStr.length; i++) {
            switch (numStr[i]) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9": {
                    if (i == 0) {
                        result += numStr[i];
                        for (int j = 0; j < zeros; j++) {
                            result += "0";
                        }
                        zeros--;
                    } else {
                        result = result + " + " + numStr[i];
                        for (int j = 0; j < zeros; j++) {
                            result += "0";
                        }
                        zeros--;
                    }
                    break;
                }
                case "0":
                    zeros--;
                    break;
            }
        }
        return result;
    }


    public static String level6(int num) {
        return expandedForm(num, 0, 10);
    }

    public static String expandedForm(int num, int mod, int exp) {
        if (num == 0) return "";
        mod = num % exp;
        return expandedForm(num - mod, mod, exp * 10) +
                ((mod > 0) ? ((exp < num) ? " + " : "") + mod : "");
    }
}
