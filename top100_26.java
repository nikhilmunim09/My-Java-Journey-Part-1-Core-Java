import java.util.Scanner;

public class top100_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int people = sc.nextInt();
        System.out.print("Enter number of seats : ");
        int seats = sc.nextInt();
        System.out.print("Total number of possible arrangements are : " + arrangements(people, seats));
        sc.close();
    }

    static int arrangements(int people, int seats) {
        return (factorial(people) / factorial(people - seats));
    }

    static int factorial(int num) {
        if (num < 1) {
            return 1;
        }
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
