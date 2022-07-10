// you can also use imports, for example:
import java.util.*;
import java.util.stream.Collectors;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public static void main(String[] args){
        int[] nums1 = {5,1,3};



        System.out.println(search(nums1, 5));
    }

    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int index = 0;
        while(start <= end){
            int mid = start+ (end-start)/2;
            if(nums[mid] == target) return mid;
            if(mid!=0 && nums[mid]> target && nums[mid]> nums[mid-1] && nums[start]<= target){
                end=mid-1;
            }else{
                start= mid+1;
            }

        }

        return index;
    }
}
