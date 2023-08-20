import java.util.*;
public class ATM_Interface {
    public static void main(String[] args) {
        //Atm interface
        int balance =0;
        System.out.println("Balance : "+balance);
        System.out.println("ATM Machine");
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.print("Choose the operation:");
            int ch=sc.nextInt();
            System.out.println(ch);
            switch (ch)
            {
                case 1: System.out.println("You have choose for withdrawal--");
                        if(balance<=0)
                        {
                            System.out.println("You cant withdraw");
                        }
                        else
                        {
                            System.out.println("Enter the amount to withdraw:");
                            int withdraw=sc.nextInt();
                            balance=balance-withdraw;
                            // System.out.println("Current balance is="+balance);
                            break;
                        }
                        break;
                case 2: System.out.println("You have chossen for Deposit--");
                        System.out.println("Enter the amount for Deposit:");
                        int deposit=sc.nextInt();
                        balance=balance+deposit;
                        // System.out.println("Current balance is="+balance);
                        break;
                case 3: System.out.println("You have chosen to check balance--");
                        System.out.println("Your current account balance is:"+balance+" rupees.");
                        break;
                case 4: // for exit
                        return ;
                default :
                        System.out.println("Invalid choice...");
            }  
        }
    }
}
