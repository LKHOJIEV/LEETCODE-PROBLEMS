public class reverseVowels {
    public static void main(String[] args) {
        System.out.println(reverse("leetcode"));
    }

    static String reverse(String s) {

        String[] strings = s.split("");
        int leftIndex = 0;
        int rightIndex = s.length() - 1;
        String tempString = "";
        for (; leftIndex < rightIndex;) {

            if (isVowel(strings[leftIndex])) {
                for (; rightIndex > leftIndex;) {
                    if (isVowel(strings[rightIndex])) {
                        tempString = strings[rightIndex];
                        strings[rightIndex] = strings[leftIndex];
                        strings[leftIndex] = tempString;
                        rightIndex--;
                        break;
                    }
                    rightIndex--;
                }
            }
            
            leftIndex++;

        }

        return String.join("", strings);
    }

    static Boolean isVowel(String str) {
        if (str.toLowerCase().equals("a") ||
                str.toLowerCase().equals("e") ||
                str.toLowerCase().equals("o") ||
                str.toLowerCase().equals("u") ||
                str.toLowerCase().equals("i")) {
            return true;
        }
        return false;
    }
}
