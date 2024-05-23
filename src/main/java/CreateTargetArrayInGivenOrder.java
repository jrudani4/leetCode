import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInGivenOrder {

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }
        return targetList.stream().mapToInt(Integer::intValue).toArray();
    }
}
