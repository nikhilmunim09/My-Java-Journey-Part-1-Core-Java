public class top100_3 {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println("=" + SumOfDigits(num, num));
    }

    static int SumOfDigits(int num, int temp) {
        if (num < 10) {
            System.out.print(num + "+");
            return num;
        }
        int result = 0;
        result += num % 10 + SumOfDigits(num / 10, temp);
        if (num < temp) {
            System.out.print(num % 10 + "+");
        } else {
            System.out.print(num % 10);
        }
        return result;
    }
}
