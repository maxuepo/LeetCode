package net.xuepo.algorithm;

/**
 * Created by xuepo on 2/13/17.
 */
public class Base7 {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        boolean isNegative = num < 0 ? true : false;
        num = Math.abs(num);
        int base = 7;
        StringBuffer sb = new StringBuffer();
        while(num != 0) {
            int digit = num % base;
            num /= base;
            sb.append(digit);
        }
        if(isNegative) sb.append("-");
        return sb.reverse().toString();
    }
}
