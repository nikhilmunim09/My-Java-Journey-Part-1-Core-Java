import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        
        int loan_amount,total_years,slabs_1,slabs_2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the loan amount : ");
        loan_amount=sc.nextInt();

        System.out.print("Total years : ");
        total_years = sc.nextInt();

        System.out.println("slabs by bank 1 : ");
        slabs_1 = sc.nextInt();

        float[][] interest_1 = new float[slabs_1][2];
        for(int i = 0 ; i < slabs_1 ; i++)
        {
            interest_1[i][0]=sc.nextFloat();
            interest_1[i][1]=sc.nextFloat();
        }

        
        System.out.println("slabs by bank 2 : ");
        slabs_2 = sc.nextInt();

        float[][] interest_2 = new float[slabs_2][2];
        for(int i = 0 ; i < slabs_2 ; i++)
        {
            interest_2[i][0]=sc.nextFloat();
            interest_2[i][1]=sc.nextFloat();
        }

        compare(loan_amount, total_years, slabs_1, slabs_2, interest_1, interest_2);



    }


    static void compare(int loan_amount,int total_years,int slabs_1,int slabs_2,float [][] interest_1,float [][] interest_2)
    {
        float total_1=0,total_2=0;
        for(int i = 0 ; i < slabs_1 ; i++)
        {
            long temp = (long) Math.pow(1+interest_1[i][1],total_years*12);
            total_1 += (loan_amount*interest_1[i][1]/(1-1/temp)) * interest_1[i][0] * 12;
        }

        for(int i = 0 ; i < slabs_2 ; i++)
        {
            long temp = (long) Math.pow(1+interest_2[i][1],total_years*12);
            total_2 += (loan_amount*interest_2[i][1]/(1-1/temp)) * interest_2[i][0] * 12;
        }

        if(total_1>total_2)
        {
            System.out.println("Bank 2.");
        }
        else 
        {
            System.out.println("bank 1");
        }
    }
}
