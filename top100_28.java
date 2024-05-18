public class top100_28 {
    public static void main(String[] args) {
        sumOfPrime(14);

    }

    static void sumOfPrime(int number) {
        int i, j;
        for (i = 2; i < number; i++) {
            for (j = 2; j < number; j++) {
                if (isPrime(i) && isPrime(j) && (i + j) == number) {
                    System.out.println(number + " can be represented as sum of : " + i + " & " + j);
                    return;
                }
            }
        }
        System.out.println("The number can't be represented as a sum of two prime numbers");
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
