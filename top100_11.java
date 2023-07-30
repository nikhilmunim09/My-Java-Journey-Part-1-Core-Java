public class top100_11 {
    public static void main(String[] args) {
        int num = 90;
        System.out.print("Prime factors of " + num + " are : ");
        factors(num);
    }

    static void factors(int num) {
        if (num == 0) {
            System.out.print("There are no factors of zero.");
            return;
        }
        if (num > 0) {
            if (num == 1) {
                return;
            }
            for (int i = 2; i <= num; i++) {
                if (num % i == 0 && isPrime(i)) {
                    System.out.print(i + " ");
                    factors(num / i);
                    break;
                }
            }
        }
    }

    static boolean isPrime(int num) {
        int i;
        if (num == 2) {
            return true;
        }
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
