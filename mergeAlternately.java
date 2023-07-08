public class mergeAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternatelyy("abcmsdlkefng", "mkfdjfkndnfklgf"));
    }

    private static String mergeAlternatelyy(String word1, String word2) {

        String[] str1 = word1.split("");
        String[] str2 = word2.split("");
        String result = "";
        int n1 = str1.length;
        int n2 = str2.length;

        for (int i = 0; i < Math.max(n1, n2); i++) {
            if (n1 > i) {
                result += str1[i];
            }
            if (n2 > i) {
                result += str2[i];
            }
        }
        return result;
    }
}
