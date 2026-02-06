import java.util.Scanner;
public class BankExp  extends Exception {


    BankExp(String str)
    {

    }


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int balance=7000;


        try
        {
            System.out.println("Enter the amount to withdraw..");
            int amt=sc.nextInt();

            if(amt>balance)
            {
                throw new BankExp("Insufficinet amount");
            }else if(amt==balance)
            {
                System.out.println("No balance Remaining "+balance);
            }
            int rem=balance-amt;
            System.out.println("Withdrawed Successfully...");
            System.out.println("Amount Remaining : "+rem);
        }catch(BankExp j)
        {
            System.out.println("Amount is insufficient.."+j);
        }finally
        {
            System.out.println("Thank you...");
        }

    }
}
