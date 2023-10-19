import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        Integer rec = 0;
        int romanNum = 0;
        HashMap<String, Integer> roman = new HashMap<String, Integer>();
        List<String> roman2 = new ArrayList<String>();
        roman.put("I",1);
        roman.put("V",5);
        roman.put("X",10);
        roman.put("L",50);
        roman.put("C",100);
        roman.put("D",500);
        roman.put("M",1000);

        roman2 = List.of(s.split(""));

        romanNum = roman.get(roman2.get(roman2.size()-1));
        rec+=romanNum;
        for(int i = roman2.size()-2;i>=0;i--){

            if (roman.get(roman2.get(i)) >= romanNum){
                romanNum = roman.get(roman2.get(i));
                rec+=romanNum;
            }
            else {
                rec-= roman.get(roman2.get(i));
            }
        }
        return rec;

    }
}
