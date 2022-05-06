package LeetcodePatterns.Arrays;

import java.util.Arrays;

public class Convert1dTo2dArray {

    public static void main(String[] args){
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 3, 5, 2}, 2, 2)));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        if(m*n != original.length)
            return new int[0][0];

        int curr = 0;
        for(int i = 0 ; i<m; i++){
            for(int j = 0; j< n; j++){
                result[i][j] = original[curr++];
            }

        }
        return result;
    }
}
