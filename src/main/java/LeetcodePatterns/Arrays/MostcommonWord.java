package LeetcodePatterns.Arrays;

import java.util.*;

public class MostcommonWord {

    public static void main(String[] args){
        String[] nums1 = {"hit", "bob"};



        System.out.println(mostCommonWord("Bob. hIt, baLl", nums1));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("\\W");
        Map<String, Integer> map = new HashMap<>();
        for(String w: words){
            if(!w.isEmpty() && !Arrays.stream(banned).anyMatch(w ::equals)){
                map.put(w, map.getOrDefault(w, 1) + 1);
            }
        }
        return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

    }
}
