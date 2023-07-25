public class top100_9 {
    public static void main(String[] args) {
        int base = 2;
        int expo = 4;
        System.out.println(base + " to the power " + expo + " is : " + power(base, expo));
    }

    static int power(int base, int expo) {
        if (expo == 1) {
            return base;
        }
        return base * power(base, --expo);
    }
}
