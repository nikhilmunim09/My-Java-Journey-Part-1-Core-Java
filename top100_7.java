public class top100_7 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
