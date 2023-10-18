//Inter face of ATM Machine !
package com.packages;

import java.util.Scanner;

import static com.packages.atm.*;

class atm{
     static int balance=10000;

    static int deposit(int b){
        balance=balance+b;

        return balance;
        
    }
    static int withdraw(int b){

        if(balance>=b) {
            balance = balance - b;

        }

       return balance;
    }
    static void checkbalance(){
        System.out.println(balance);
        
    }
    
}
public class atm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int balance = 10000;
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
                    deposit(damount);
                    System.out.println("successfully deposited");
                    System.out.print("Your updated balance : ");
                    checkbalance();
                    break;

                case 2:
                    System.out.print("Enter Withdrawal amount  : ");
                    int wamount=sc.nextInt();
                    if(wamount<=balance){
                        withdraw(wamount);
                        System.out.println("Withdrawal Succesfully ");
                        System.out.print("Your updated balance : ");
                        checkbalance();
                    }else{
                        System.out.println("Insufficient Balance !");
                    }
                        break;

                case 3:
                    System.out.print("Available Balance : ");
                    checkbalance();
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

