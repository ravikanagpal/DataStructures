package LeetcodePatterns;

public class BinarySearchBoolean {

    public static void main(String[] args){
        System.out.println(findBoundary(new boolean[]{true,true,true,true,true}));
    }

    public static int findBoundary(boolean[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int boundaryIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid]) {
                boundaryIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }
}
