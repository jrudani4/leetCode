public class LeftAndRightSumDifferences {

    public static int[] leftRightDifference(int[] nums) {
        int[] leftSumArray = new int[nums.length];
        int[] rightSumArray = new int[nums.length];
        int leftSum = 0;
        rightSumArray[nums.length - 1] = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftSumArray[0] = leftSum;
            } else {
                leftSum = leftSumArray[i - 1] + nums[i - 1];
            }
            leftSumArray[i] = leftSum;
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSumArray[i] = rightSumArray[i + 1] + nums[i + 1];
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(leftSumArray[i] - rightSumArray[i]);
        }
        return ans;
    }
}
