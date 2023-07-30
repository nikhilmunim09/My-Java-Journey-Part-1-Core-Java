public class top100_12 {
    public static void main(String[] args) {
        int num = 144;
        if (num == isStrong(num)) {
            System.out.println("Yes,the given number is a strong number.");
        } else {
            System.out.println("No,the given number is not strong number.");
        }
    }

    static int isStrong(int num) {
        if (num < 10) {
            return factorial(num);
        }
        return factorial(num % 10) + isStrong(num / 10);
    }

    static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
