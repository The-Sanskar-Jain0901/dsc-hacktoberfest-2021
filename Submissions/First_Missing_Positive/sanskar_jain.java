package Submissions.First_Missing_Positive;

public class sanskar_jain {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 1 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int value = Math.abs(nums[i]);
            if (value != n + 1 && nums[value - 1] > 0) {
                nums[value - 1] = -nums[value - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        int[] num = { 7, 8, 9, 11, 12 };
        System.out.print(firstMissingPositive(num));

    }
}