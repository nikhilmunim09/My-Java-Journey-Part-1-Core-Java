import java.util.Scanner;

public class example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        
        // create a 2D array to store the pattern
        int[][] arr = new int[n][n];
        
        // initialize the starting row, column, and value
        int row = 0;
        int col = 0;
        int val = 1;
        
        // loop until the value reaches n*n
        while (val <= n * n) {
            // fill the current cell with the value
            arr[row][col] = val;
            
            // increment the value
            val++;
            
            // if the row is even, move to the right column
            if (row % 2 == 0) {
                col++;
            }
            // else, move to the left column
            else {
                col--;
            }
            
            // if the column reaches the end, move to the next row and reset the column
            if (col == n) {
                row++;
                col = n - 1;
            }
            // if the column reaches the beginning, move to the next row and reset the column
            else if (col == -1) {
                row++;
                col = 0;
            }
        }
        
        // print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}