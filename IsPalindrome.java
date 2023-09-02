public class IsPalindrome {
    public static void main(String[] args) {
        int a = -121;
        int b = 123321;
        int c = 12309321;
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
        System.out.println(isPalindrome(c));
    }

    public static boolean isPalindrome(int x) {

        return (String.valueOf(x).contentEquals(new StringBuilder(String.valueOf(x)).reverse()));
    }
}
