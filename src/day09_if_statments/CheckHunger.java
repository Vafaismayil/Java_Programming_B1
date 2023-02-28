package day09_if_statments;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you hungry?");
       boolean isHungry = input.hasNextBoolean();
   if(isHungry ) {
       System.out.println("Go the restaurant");
   }else {

       System.out.println("Great , then practice java");
   }
    }









}
