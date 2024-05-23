public class StrictlyIncreasing {

    public static boolean canBeIncreasing(int[] nums) {
        int n = nums.length;
        boolean oneSkip = false;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                max = nums[i];
            } else if (!oneSkip) {
                int prev = i >= 2 ? nums[i - 2] : 0;
                if (prev < nums[i]) {
                    max = nums[i];
                }
                oneSkip = true;
            } else {
                return false;
            }
        }
        return true;
    }
}
