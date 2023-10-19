public class ReverseNum {

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {

        try{
            if (x >= 0)
                return  Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
            else {
                return  (-1)*Integer.parseInt(new StringBuilder(String.valueOf(-x)).reverse().toString());
            }
        }catch(Exception e){
            return 0;
        }

    }
}
