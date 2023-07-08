public class GcdOfStrings {

    public static void main(String[] args) {

        System.out.println(
                gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));

    }

    public static String gcdOfStrings(String str1, String str2) {

        String minVal;
        String maxVal;
        String result = "";

        if (str1.length() >= str2.length()) {
            minVal = str2;
            maxVal = str1;
        } else {
            minVal = str1;
            maxVal = str2;
        }
        for(int i = 0;i < minVal.length();i++){
            String valChar = minVal.substring(0, i+1);
            
            if(maxVal.replace(valChar, "").equals("") && minVal.replace(valChar, "").equals("") ){
                result = valChar;
            }

        }



        return result;
    }


       /*  public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        return b ==0 ? a : gcd(b, a % b);
    }*/

}
