public class top100_5 {
    public static void main(String[] args) {
        int num = 1221;
        String temp1 = "" + num;
        String temp2 = isPalindrome(temp1, String.valueOf(temp1.charAt(0)));
        if (temp1.equals(temp2)) {
            System.out.println("Yes,the numbers are palindrome.");
        } else {
            System.out.println("No,the numbers are not palindrome.");
        }
    }

    static String isPalindrome(String num, String end) {
        if (num.equals(end)) {
            return num;
        }
        return (num.charAt(num.length() - 1)) + isPalindrome(num.substring(0, num.length() - 1), end);
    }
}
