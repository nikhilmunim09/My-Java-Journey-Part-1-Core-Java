public class top100_4 {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Number in original order : " + num);
        System.out.print("Number in reverse order : ");
        reverse(1234);
    }

    static void reverse(int num) {
        if (num < 10) {
            System.out.print(num);
            return;
        }
        System.out.print(num % 10);
        reverse(num / 10);
    }
}
