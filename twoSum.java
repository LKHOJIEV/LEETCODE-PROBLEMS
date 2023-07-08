import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
       int leng = nums.length;
       
       for (int i = 0;i<leng-1;i++){
        
        for (int j = i+1; j < leng;j++){
        
            if(nums[i]+nums[j] == target){
               return new int[]{i,j};
           }
        
        }   
       
       }
       return null; 
    }
    
}