public class reverseNumber {

    public static Integer num = 0;

    public static void main(String[] args) {

        System.out.println(reverseNumber2(12345678));

    }

    static Integer reverseNum(Integer integer) {

        if (integer > 10) {

            num += (int) Math.pow(10, (int) Math.log10(integer / 10) + 1) * (integer % 10);
            reverseNum(integer / 10);

        } else {
            num += integer;
            return num;
        }
        return num;

    }

    static Integer reverseNumber2(Integer i) {

        if (i / 10 < 1) {
            num+=i;
        } else {
            num += i % 10;
            num *= 10;
            reverseNumber2(i / 10);
        }
        return num;
    }
}
