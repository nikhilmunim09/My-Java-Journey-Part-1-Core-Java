public class top100_6 {
    public static void main(String[] args) {
        int num = 370;
        int length = order(num);
        if (num == isArmstrong(num, length)) {
            System.out.println("Yes,the given number is armstrong.");
        } else {
            System.out.println("No,the given number is not armstrong.");
        }
    }

    static int isArmstrong(int num, int length) {
        if (num < 10) {
            return (int) Math.pow(num, length);
        }
        int temp = num % 10;
        return (int) (Math.pow(temp, length) + isArmstrong(num / 10, length));
    }

    static int order(int num) {
        int length;
        String temp = "" + num;
        length = temp.length();
        return length;
    }
}
