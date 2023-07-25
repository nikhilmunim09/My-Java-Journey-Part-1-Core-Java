public class top100_10 {
    public static void main(String[] args) {
        int num = -100;
        System.out.print("Factors of " + num + " are : ");
        factors(num);
        factors((num / -1));
    }

    static void factors(int num) {
        if (num == 0) {
            System.out.print("There are no factors of zero.");
            return;
        }
        if (num > 0) {
            if (num == 1) {
                System.out.print(num);
                return;
            }
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                    factors(num / i);
                    break;
                }
            }
        }
        if (num < 0) {
            if (num == -1) {
                System.out.print(num + " ");

                return;
            }
            for (int i = -2; i >= +num; i--) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                    factors(-(num / i));
                    break;
                }
            }
        }
    }
}
