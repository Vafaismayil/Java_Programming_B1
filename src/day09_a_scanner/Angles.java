package day09_a_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the tree num");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
         int cal = num1 + num2 + num3 ;


        System.out.println("it is triangle: " +( cal ==180));
        System.out.println("it is circle:" +( cal ==360));
        System.out.println("It is either triangle or circle: " + (cal == 360 || cal ==180));


    }






}
