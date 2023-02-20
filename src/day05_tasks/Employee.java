package day05_tasks;

public class Employee {
    public static void main(String[] args) {
        String firstname = "James";
        String lastname = "Bond";
        String companyName = "Amazon";
        String jobTitle = "SDET";
        String officeAddress = " 12122 Polo Dr ";
        int salary = 120000;
        int day = 8;
        int month = 11;
        int year = 2022;
        boolean isFullTime = true;
        String fullName = "" + firstname + " " + lastname;
        String fullDate = month + "/" + day + "/" + year;
        String email = firstname + "" + day + "@" + "$" + companyName + ".com";
        double salaryAfterTreeYears = salary + 2600 + 2600 ;
        String message = "Full Name: " + fullName + "\nCompany name is " + companyName + "\nJob title: " + jobTitle + "\nJob is full time: " + isFullTime + "\nStart Date: " + fullDate + "\nE-mail: " + email + "\nSalary After 3 years: $" + salaryAfterTreeYears +"\nOffice address: " + officeAddress ;
        System.out.println(message);
  // boolean b1,b2;declaration
 //  String s1 ="1",s2;declaration
  // double i1,double i2 ;not declaration
  // int i1;int i2;declaration
 //  int i3;i4;not declaration

    }








}
