public class top100_15 {
    public static void main(String[] args) {
        int number = 15;
        if (isHarshad(number) == 1) {
            System.out.println("Yes,the given number is harshad number.");
        } else {
            System.out.println("No,the given number is not harshad number.");
        }
    }

    static int isHarshad(int number) {
        int sum = sumOfDigits(number);
        if (number % sum == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    static int sumOfDigits(int number) {
        if (number < 10) {
            return number;
        }
        return (number % 10) + sumOfDigits(number / 10);
    }
}
