package net.xuepo.algorithm;

import java.util.Map;
import java.util.HashMap;
/**
 * Created by xuepo on 4/9/16.
 */
public class FractiontoRecurringDecimal {

    public String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) return "NaN";
        if (numerator == 0) return "0";

        String sign = (denominator>>>31^numerator>>>31) == 1 ? "-" : "";

        long num = numerator;
        long den = denominator;

        num = Math.abs(num);
        den = Math.abs(den);

        long major = num / den;
        long rem = num % den;

        if (rem == 0) return sign + major;

        StringBuilder sb = new StringBuilder();
        sb.append(sign).append(major).append(".");

        Map<Long, Integer> mp = new HashMap<>();
        while (rem != 0) {

            if(mp.containsKey(rem)) {
                int index = mp.get(rem);
                sb.insert(index, "(").append(")");
                break;
            } else {
                sb.append(rem * 10 / den);
                mp.put(rem, sb.length());
            }
            rem = rem * 10 % den;
        }
        return sb.toString();
    }
}
