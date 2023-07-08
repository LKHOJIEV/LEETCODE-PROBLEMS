import java.util.Arrays;

public class canPlaceFlowers {
    public static void main(String[] args) {

        //System.out.println(canPlace(new int[] { 1, 0, 0, 0, 1 }, 1));
        //System.out.println(canPlace(new int[] { 1, 0, 0, 0, 1 }, 2));
        //System.out.println(canPlace(new int[] { 1, 0, 0, 0, 1, 0, 0 }, 2));
        //System.out.println(canPlace(new int[] { 0 }, 1));
        System.out.println(canPlace(new int[] { 1, 0}, 1));
        //System.out.println(canPlace(new int[] { 1, 0, 0}, 1));
    }

    private static boolean canPlace(int[] flowerbed, int n) {

        int maxNum = 0;
        int i = 0;
        while (i < flowerbed.length) {
            // length = 1
            if (flowerbed.length == 1 && flowerbed[0] == 0) {
                maxNum++;
                break;
            }
            // last index
            else if (i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                maxNum++;
                break;
            }
            // others
            else if (i < flowerbed.length - 1 && i > 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                maxNum++;
                i++;
            }
            // first index
            else if (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                maxNum++;
                i++;
            }
            i++;
        }
        System.out.println(Arrays.toString(flowerbed));
        if (maxNum >= n)
            return true;
        else
            return false;
    }

}
