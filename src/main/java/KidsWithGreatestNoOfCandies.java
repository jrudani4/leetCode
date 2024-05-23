import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNoOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int max = Integer.MIN_VALUE;

        for (int i : candies) {
            if (i > max) max = i;
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
