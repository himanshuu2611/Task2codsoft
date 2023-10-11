//ATM machine


import java.util.Scanner;

import static com.packages.atm.*;

class atm{

    static int deposit(int a,int b){
        int c=a+b;

        return c;
        
    }
    static int withdraw(int a,int b){
        int c = 0;
        if(a>=b){
            c=a-b;
        }

        return c;
    }
    static void checkbalance(int a){
        System.out.println(a);
        
    }
    
}
public class atm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        System.out.println("WELCOME !");
        while (true) {
            System.out.println("1. deposit ");
            System.out.println("2. withdraw ");
            System.out.println("3. check balance");
            System.out.println("4. Exit");

            System.out.print("Choose Given option  : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("enter amount to be deposit : ");
                    int damount = sc.nextInt();
//                    int balance=10000;
                    int depbalance;
                    depbalance=deposit(balance,damount);
                    System.out.println("succesfully deposited !");
                    System.out.println("Total balance : "+depbalance);
                    balance=depbalance;
                    break;

                case 2:
                    System.out.print("Enter Withdrawal amount  : ");
                    int wamount=sc.nextInt();
                    int witbalance;
                    witbalance=withdraw(balance,wamount);
                    System.out.println("succesfully withdrawal !");
                    System.out.println("Remaining amount : "+witbalance);
                    balance=witbalance;
                    break;

                case 3:
                    System.out.println("Your Total  Balance : "+balance);
                    break;

                case 4:
                    System.out.println("Thank you for using me ! ");
                    System.out.println("Visit Again !");
                    System.exit(0);
                default:
                    System.out.println("Invalid option !");
            }
        }
    }
}

