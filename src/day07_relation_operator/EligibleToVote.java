package day07_relation_operator;

public class EligibleToVote {
    public static void main(String[] args) {
       String name ="James Bond";
        boolean isCitizen = true;
         boolean doHaveBack= false;
        int age = 49;
        boolean isEligible = age>=18 && isCitizen && !doHaveBack ;
        System.out.println(name + " is eligible for vote" + isEligible );

    }






}
