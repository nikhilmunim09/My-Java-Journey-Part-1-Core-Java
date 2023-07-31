public class top100_16 {
    public static void main(String[] args) {
        int number = 18;
        if (isAbundant(number)) {
            System.out.println("Yes,the given number is abundant number.");
        } else {
            System.out.println("No,the given number is not abundant number.");
        }
    }

    static boolean isAbundant(int num) {
        if (divisorsSum(num, 1) > num) {
            return true;
        } else {
            return false;
        }
    }

    static int divisorsSum(int num, int start) {
        if (num == 0) {
            return 0;
        }
        for (int i = start; i < num; i++) {
            if (num % i == 0) {
                start = i;
                return i + divisorsSum(num, ++start); // now iteration will start from the number next to the value of i
                                                      // for which num%i==is true.
            }
        }
        return 0;
    }
}
