package day05_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName  = "James";
        String lastName = "Bond";
        char gender = 'M';
        int age = 40;
        String companyName = "MI6";
        boolean areThereFullTime= true;
        String jobTitle = "Special Agent ";
        int salary = 1000000;
        int numberOfThePto = 15;
        boolean isMarried = false;
        char suite = 'D';

        String message = "Employment information for " + firstName + " " + lastName + "\nGender: " + gender + "\nSpecial Agent at " + companyName + "\nCurrently " + age + " years old " + companyName + " is location in suite " + suite + "\nThis years salary comes to $" + salary + "\nOther details: \n\t" + "PTO: " + numberOfThePto + "\n\tFull time? " + areThereFullTime + "\n\tMarried? " + isMarried ;
        System.out.println(message);

    }

}
