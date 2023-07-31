public class top100_20 {
    public static void main(String[] args) {
        int octal = 512;
        System.out.println(octalToDecimal(octal, 0));
    }

    static int octalToDecimal(int octal, int power) {
        if (octal < 10) {
            return (int) (octal * Math.pow(8, power));
        }
        return (int) ((octal % 10) * Math.pow(8, power) + octalToDecimal(octal / 10, ++power));
    }
}
