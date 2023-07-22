public class top100_1 {
    public static void main(String[] args) {
        System.out.println(sum(12, 15));
    }

    static int sum(int num, int stop) {
        if (num == stop) {
            return num;
        }
        return (num + sum(++num, stop));
    }
}

// program to find sum of numbers withim range of two numbers
