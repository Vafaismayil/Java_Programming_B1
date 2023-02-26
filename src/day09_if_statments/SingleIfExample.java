package day09_if_statments;

import java.util.Scanner;

public class SingleIfExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int result = 78;
        int passRate = 65;

        if(result >= passRate ) {
            System.out.println("Passed java quiz");
        }else {
            System.out.println("Failed");
        }
    }







}
