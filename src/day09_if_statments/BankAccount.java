package day09_if_statments;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("What is your balans");
        double balance = input.nextDouble();
        System.out.println("How much do you want to");
        double withDraw = input.nextDouble();
    balance -= withDraw ;
        if(balance <= withDraw ) {
            System.out.println("You have money");
        }else {
            System.out.println("You don't have money");
        }
    }





}
