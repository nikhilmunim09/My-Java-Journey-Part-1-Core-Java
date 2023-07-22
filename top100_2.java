public class top100_2 {
    public static void main(String[] args) {
        int start, end, i;
        start = 0;
        end = 20;
        for (i = start; i <= end; i++) {
            if (i < 2) {
                continue;
            }
            if (i == 2) {
                System.out.print("2 ");
                continue;
            }
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
