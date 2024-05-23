public class ShuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n * 2];
        int j = 0;
        for (int i = 0; i < n; i++) {
            ans[j++] = nums[i];
            ans[j++] = nums[n + i];
        }
        return ans;
    }
}
