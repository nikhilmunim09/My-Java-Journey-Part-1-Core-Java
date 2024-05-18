import java.util.Scanner;

public class top100_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people : ");
        int persons = sc.nextInt();
        System.out.println("Maximum possible handshakes are : " + handshakes(persons));
    }

    static int handshakes(int persons) {
        return (persons * (persons - 1) / 2);
    }
}
