import java.io.*;
import java.util.*;

public class ruhujais {

    static int maxGCD = 0;
    static List <Integer> list = new list<>();
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == b) {
            System.out.println(a);
        } else {
            int result = gcd(a, b);
            System.out.println(result);
        }
    }

    public static List <Integer> gcdArrays(List <Integer> arr )
    {
         subArrays(arr.toArray(), 0, 0);
    }

    static void subArrays(int[] arr, int start, int end)
    { 
        
        List <Integer> list = new List<Integer>();
        if (end == arr.length)
        {
            return;
        }
        
        else if (start > end)
        {
            subArrays(arr, 0, end + 1);
        }
        
        else 
        {
            for (int i = start; i < end; i++)
            {
                list.add(arr[i]);
            }
            list.add(arr[end]);

            int gcd = findGCD(list.toArray(),list.size);



            subArrays(arr, start + 1, end);
        }
        return;
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    static int findGCD(int arr[], int n) 
    { 
        int result = arr[0]; 
        for (int element: arr){ 
            result = gcd(result, element); 
  
            if(result == 1) 
            { 
               return 1; 
            } 
        } 
  
        return result; 
    } 
}     

