package TwoSum;

public class NaiveApproach {
    public static void main(String args[]) {
        int[] num = new int[]{2, 7, 11, 15};

        int[] result = twoSum(num,9);
        for (int x: result) {
            System.out.println(x);
        }

    }

    /**
     * This is a brute force approach, i.e., Loop through each element x and find if there is another value that
     * equals to target−x, with time complexity O(n^2). For each element, we try to find its
     * complement by looping through the rest of the array which takes O(n) time. Therefore, the time complexity is
     * O(n^2).
     * Space complexity: O(1)O(1). The space required does not depend on the size of the input array,
     * so only constant space is used.
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if ((nums[i] + nums[j]) == target) return new int[]{i, j};
            }

        }
        return new int[]{};
    }
}