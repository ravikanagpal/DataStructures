// you can also use imports, for example:
import java.util.*;
import java.util.stream.Collectors;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public static void main(String[] args){
        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> arr = Arrays.stream(A).boxed().collect(Collectors.toList());
        for(int i=1; i<= 100000; i++){
            if(!arr.contains(i)){
                return i;
            }
        }
        return 100000;
    }
}
