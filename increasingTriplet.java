import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class increasingTriplet {
    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
    }
       
    static boolean increasingTriplet(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        List sortedList = list.stream().sorted().collect(Collectors.toList());

        List<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < sortedList.size(); i++) {

            indexList.add(list.indexOf(sortedList.get(i)));

        }
        
        for (int i = 0; i <= indexList.size()-3; i++) {
            if (indexList.get(i) < indexList.get(i+1) && indexList.get(i+1) < indexList.get(i+2)) return true;
        }
        return false;
    }
}
