package net.xuepo.algorithm;

/**
 * Created by xuepo on 4/4/16.
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        if (num2.equals("0") || num1.equals("0")) return "0";
        String res = "0";
        for (int i = num2.length() - 1; i >= 0; i--) {
            String tmp = multiplyDigit(num1, num2.charAt(i)) + padZero(num2.length() - 1 - i);
            res = add(tmp, res);
        }
        return res;
    }

    private String padZero(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("0");
        }
        return sb.toString();
    }

    private String multiplyDigit(String num, char ch) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = num.length() - 1; i >= 0; i--) {
            int a = num.charAt(i) - '0';
            int b = ch - '0';
            int sum = a * b + carry;
            int digit = sum % 10;
            carry = sum / 10;
            sb.append(digit);
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    private String add(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int a = 0;
            int b = 0;

            if (i >= 0) {
                a = num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                b = num2.charAt(j) - '0';
                j--;
            }
            int sum = a + b + carry;
            int digit = sum % 10;
            carry = sum / 10;
            sb.append(digit);
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
