public class NoOfEmployeesWhoMetTheTarget {

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target) count++;
        }
        return count;
    }
}
