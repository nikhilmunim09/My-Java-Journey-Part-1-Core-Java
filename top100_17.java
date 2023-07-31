public class top100_17 {
    public static void main(String[] args) {
        int number1 = 24;
        int number2 = 18;
        int dividend = Math.max(number1, number2);
        int divisor = Math.min(number1, number2);
        System.out.println("HCF of " + number1 + " & " + number2 + " is : " + calcHCF(dividend, divisor));
    }

    /*
     * public static int decideDivisor(int number1, int number2) {
     * int dividend=number1, divisor=number2;
     * if (number1 > number2) {
     * dividend = number1;
     * divisor = number2;
     * } else if (number1 < number2) {
     * dividend = number2;
     * divisor = number1;
     * }
     * return calcHCF(dividend, divisor);
     * }
     */

    public static int calcHCF(int dividend, int divisor) {
        int temp;
        if (dividend % divisor == 0) {
            return divisor;
        }
        temp = divisor;
        divisor = dividend % temp;
        dividend = temp;
        return calcHCF(dividend, divisor);
    }
}
