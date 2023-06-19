import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KidsWithTheGreatestNumberOfCandies1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().orElse(0);
        return Arrays
                .stream(candies)
                .mapToObj(it -> it + extraCandies >= max ? Boolean.TRUE : Boolean.FALSE)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int [] candies = new int[]{2,3,5,1,3};
        var extraCandies = 3;
        System.out.print(kidsWithCandies(candies, extraCandies));
    }
}
