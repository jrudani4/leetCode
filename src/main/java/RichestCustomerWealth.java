public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int temp = 0;
            for (int i : account) {
                int sum = i + temp;
                if (temp < sum) {
                    temp = sum;
                }
            }
            maxWealth = Math.max(maxWealth, temp);
        }
        return maxWealth;
    }
}
