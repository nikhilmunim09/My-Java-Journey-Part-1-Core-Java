public class top100_19 {
    public static void main(String[] args) {
        String i = "000100001";
        i = i.substring(i.indexOf("1"));
        int number = Integer.parseInt(i);
        System.out.println("The number " + number + " in decimal is equal to : " + binaryToDecimal(number, 0));
    }

    static int binaryToDecimal(int num, int power) {
        if (num < 10) {
            return (int) (Math.pow(2, power) * num);
        }
        return (int) ((num % 10) * Math.pow(2, power) + binaryToDecimal(num / 10, ++power));
    }
}
