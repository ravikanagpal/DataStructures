package LeetcodePatterns.Arrays;

public class WaterinContainer {
    public static int maxArea(int[] height) {
        int maxValue=0;
        for(int i=0; i<height.length-1;i++){
            for(int j=i+1; j<height.length;j++){
                maxValue = Math.max(maxValue, (j-i)*Math.min(height[i], height[j]));
            }
        }

        return maxValue;
    }

    public static void main(String[] args){
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
