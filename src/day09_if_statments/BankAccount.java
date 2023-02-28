package day09_if_statments;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("What is your balance?");
        double balance = input.nextDouble();
        System.out.println("How much do you want to withdraw");
        double withDraw = input.nextDouble();
        if(balance > withDraw ) {
            balance -=withDraw;
            System.out.println("You new balance is " + balance );
        }else {
            System.out.println("You can not withdraw");
        }
    }
}
