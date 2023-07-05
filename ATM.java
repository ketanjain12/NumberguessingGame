import java.util.Scanner;
public class ATM  {
    public static void main(String[] args){
        int balance = 100000, withdraw, deposit;
        try (Scanner sc = new Scanner(System.in)) {

            while(true)
            {
                System.out.println("  Welcome To The ATM  ");

                System.out.println("Click 1 for Withdraw");

                System.out.println("Click  2 for Deposit");

                System.out.println("Click  3 for Check Balance");

                System.out.println("Click  4 for EXIT ");

                System.out.print("Choose the operation you want to perform :");

                int choice = sc.nextInt();

                switch(choice)
                {
                    case 1 :
                    System.out.println("Enter the amount number to be withdrawn :");

                    withdraw = sc.nextInt();

                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please Collect Your Money");

                    }
                    else{
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;


                    case 2:
                    System.out.println("Enter amount to be deposited : ");
                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Your amount has been succesfully deposited");
                    System.out.println("");
                    break;

                    case 3:
                    System.out.println("Balance : " +balance);
                    System.out.println("");
                    break;

                    case 4:
                    System.out.println("Thank you for visiting us");
                    System.exit(0);

                }
            }
        }

    }
}
