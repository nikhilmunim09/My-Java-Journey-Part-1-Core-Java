public class top100_14 {
    public static void main(String[] args) {
        int number = 376;
        if (isAutomorphic(number)) {
            System.out.println("Yes,the number is automorphic.");
        } else {
            System.out.println("No,the number is not automorphic.");
        }
    }

    static boolean isAutomorphic(int number) {
        int square = number * number;
        String num = "" + number;
        String sqr = "" + square;
        if (sqr.endsWith(num)) {
            return true;
        } else {
            return false;
        }
    }
}
