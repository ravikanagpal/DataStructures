package stringToInteger_atoi;

import java.math.BigInteger;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 *
 * The algorithm for myAtoi(string s) is as follows:
 *
 * Read in and ignore any leading whitespace.
 * Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 * Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
 * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 * If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 * Return the integer as the final result.
 * Note:
 *
 * Only the space character ' ' is considered a whitespace character.
 * Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 */
public class Naive {

    public static void main(String args[]) {
        System.out.println(myAtoi("-9223372036854775809"));
    }

    public static int myAtoi(String s) {
        int x = 0;
        String trim = s.trim();
        String res= "";
        for(int i = 0; i< trim.length(); i++){
           if(( i==0 && (trim.charAt(0)=='+' || trim.charAt(0)=='-') ) || Character.isDigit(trim.charAt(i))){
                res+= trim.charAt(i);
            }else{
                break;
            }
        }
        if(res.length() == 0 || (res.length()==1 && (res.charAt(0)=='+' || res.charAt(0)== '-')))
            return 0;

        String max = String.valueOf(Integer.MAX_VALUE);
        String min = String.valueOf(Integer.MIN_VALUE);
        BigInteger b1 =    new BigInteger(res);
        BigInteger b_max = new BigInteger(max);
        BigInteger b_min = new BigInteger(min);

        if(b1.compareTo(b_max) > 0)
            x = Integer.MAX_VALUE;
        else if (b1.compareTo(b_min) < 0)
            x = Integer.MIN_VALUE;
        else
            x = Integer.parseInt(res);
        return x;
    }
}
