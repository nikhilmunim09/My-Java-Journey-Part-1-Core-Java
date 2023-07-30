public class top100_13 {
    public static void main(String[] args) {
        int num = 7;
        if (num == divisorsSum(num, 1)) {
            System.out.println("Yes,the given number is perfect number.");
        } else {
            System.out.println("No,the given number is not a perfect number.");
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
