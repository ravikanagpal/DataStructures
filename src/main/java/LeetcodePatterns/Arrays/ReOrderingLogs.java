package LeetcodePatterns.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReOrderingLogs {

    public static void main(String[] args){
        String[] nums1 = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};

        System.out.println(Arrays.toString(reorderLogFiles(nums1)));
    }


    public static String[] reorderLogFiles(String[] logs) {
        List<String> letters = new ArrayList<>();
        List<String> digits = new ArrayList<>();
        for(String s: logs){
            String[] tokens = s.split(" ");
            if(Character.isDigit(tokens[1].charAt(0))){
                digits.add(s);
            }else{
                letters.add(s);
            }
        }

        letters.addAll(digits);

        return letters.toArray(new String[letters.size()]);

    }
}
