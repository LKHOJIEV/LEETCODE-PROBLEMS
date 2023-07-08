import java.util.Arrays;
import java.util.List;

public class kidsWithCandies {
    public static void main(String[] args) {
        
System.out.println(kidsWithCandie(new int[]{2,3,5,1,3}, 3));

    }

    private static List<Boolean> kidsWithCandie(int[] candies, int extraCandies) {
        
        int cnt = candies.length;
        int maxNum = candies[cnt-1];
        for (int i =0;i<cnt;i++){
            if (candies[i]>=maxNum){
                maxNum = candies[i];
            }
        }
        Boolean[] kidsCandies = new Boolean[cnt];
        for (int i =0;i<cnt;i++){
            if (candies[i]+extraCandies>=maxNum){
                kidsCandies[i] = true;
            }else {
                kidsCandies[i] = false;
            }
        }

        return Arrays.asList(kidsCandies);

    }
}
