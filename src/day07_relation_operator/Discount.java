package day07_relation_operator;

public class Discount {
    public static void main(String[] args) {
//        declare and assign
//        is it the weekend
//        are you a teacher
//        are you a police officer
//        are you a firefighter
//
//        Do you get a discount?
//                Must be a weekend day and you must be one of the given professions
    boolean  isWeekEnd =true;
    boolean  areYouTTeacher = true;
    boolean areYouPolice = false;
    boolean areYouFirefighter = false;
        boolean getDiscount = isWeekEnd && (areYouTTeacher ||areYouPolice||areYouFirefighter) ;
        System.out.println(getDiscount );

    }







}
