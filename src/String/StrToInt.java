package String;

//import java.util.*;
//public class StrToInt {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        s = s.trim();
//
//        if (s.isEmpty()) {
//            return 0;
//        }
//        int idx = 0;
//        int sign = 1;
//        int ans = 0;
//
//        if(s.charAt(idx) == '+' || s.charAt(idx) == '-'){
//            if(s.charAt(idx) == '-') {
//                sign = -1;
//            }
//            idx++;
//        }
//
//
//
//
//    }
//}


class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }
        int sign = 1;
        long ans = 0;
        int index = 0;
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            if (s.charAt(index) == '-'){
                sign = -1;
            }
            index++;
        }
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            ans = ans * 10 + (s.charAt(index) - '0');

            if (sign == 1 && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }
        return (int) (sign* ans);
    }
}