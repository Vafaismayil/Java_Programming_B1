package day06_unary_operator;

public class Store {
    public static void main(String[] args) {
        String store = "Target";
        int numberOfTv= 100;

        System.out.println("I have a total of " + numberOfTv + "TVs");
        System.out.println("Person comes to store and they bout one tv");
      numberOfTv = numberOfTv -1;
        System.out.println("Number of tv " + --numberOfTv );
        System.out.println("Anather person comes into store and puts the Tv into his cart");
        System.out.println("Available TV in store " + numberOfTv-- );

    }






}
