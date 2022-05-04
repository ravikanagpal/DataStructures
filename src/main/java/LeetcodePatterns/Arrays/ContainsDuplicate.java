package LeetcodePatterns.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args){
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for (int i=0; i<nums.length; i++){
            s.add(nums[i]);
        }
        if(s.size()<nums.length){
            return true;
        }else return false;

    }
}
