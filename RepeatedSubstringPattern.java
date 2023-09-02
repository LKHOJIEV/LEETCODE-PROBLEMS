public class RepeatedSubstringPattern {


    public static void main(String[] args) {



    }

    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();

        boolean isThatTrue = false;
        for (int i = 1; i <= length / 2; i++) {
            if (length % i == 0) {
                for (int j = 2; j <= length / i; j++) {

                    String temp_str1 = s.substring(0, i);
                    String temp_str12 = s.substring((j - 1) * i, j * i);

                    if (s.substring(0, i).equals(s.substring((j - 1) * i, j * i))) {
                        isThatTrue = true;
                        if (length / i == j) {
                            return isThatTrue;
                        }
                    } else {
                        isThatTrue = false;
                        break;
                    }
                }
            }
        }
        return isThatTrue;
    }
}