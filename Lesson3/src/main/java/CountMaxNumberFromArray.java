public class CountMaxNumberFromArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 10, 3};
        int x = max(nums);
        System.out.println(x);
    }

    public static int max(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}