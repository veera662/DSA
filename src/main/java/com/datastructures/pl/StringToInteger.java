package com.datastructures.pl;

public class StringToInteger {

    public static void main(String[] args) {
        StringToInteger stringToInteger=new StringToInteger();
        System.out.println(stringToInteger.myAtoi(" "));
    }
    public int myAtoi(String s) {
        if( s.isEmpty() || s.isBlank()){
            return 0;
        }
        int sign = 1, base = 0, i = 0;
        char str[] = s.toCharArray();
        // if whitespaces then ignore.
        while (str[i] == ' ') {
            i++;
        }

        // sign of number
        if (str[i] == '-' || str[i] == '+') {
            sign = 1 - 2 * (str[i++] == '-' ? 1 : 0);
        }

        // checking for valid input
        while (i < str.length
                && str[i] >= '0'
                && str[i] <= '9') {

            // handling overflow test case
            if (base > Integer.MAX_VALUE / 10
                    || (base == Integer.MAX_VALUE / 10
                    && str[i] - '0' > 7)) {
                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
            base = 10 * base + (str[i++] - '0');
        }
        return base * sign;
    }
}
