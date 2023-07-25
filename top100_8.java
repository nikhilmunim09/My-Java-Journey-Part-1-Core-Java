public class top100_8 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is : " + factorial(num));
    }

    static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
