import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode_Kids With the Gratest Number of Candies
 */
public class Leetcode_KidsWithCandies {

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int graterValue = 0;
        List<Boolean> result = new ArrayList<>();
        for (int i=0; i<candies.length; i++) {
            if(graterValue<candies[i]){
                graterValue = candies[i];
            }
        }
        for (int i=0; i<candies.length; i++) {
            if(candies[i]+extraCandies>=graterValue){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int extraCandies = 3;
        int [] candies = {2,3,5,1,3};
        System.out.print(kidsWithCandies(candies, extraCandies));
    }
}