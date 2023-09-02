import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.IntPredicate;

public class SearchMatrix {
    public static void main(String[] args) {

        int[][] nums = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int trg = 7;

        System.out.println(searchMatrix(nums,trg));
    }
    public static boolean searchMatrix(int[][] matrix, int target){

        int lenght = matrix[0].length;
        int rows = matrix.length;

        for (int i = rows-1; i>= 0; i--){
            if (matrix[i][0] == target){
                return true;
            }else if (matrix[i][0] < target){
                return Arrays.binarySearch(matrix[i],target)>0;
            }
        }
    return false;
    }
}
