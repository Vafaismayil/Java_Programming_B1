package day05_tasks;

public class House {
    public static void main(String[] args) {
     String house = "Townhouse";
     int numberBedroom = 4;
     int numberBathrooms = 3;
     int kitchen  =1;
     int zipcode = 22033;
     boolean isThereABasement = true;
     boolean isThereAttic = false;
    boolean isTherePool = false;
    boolean isTheHouseForSale = true;
    double prices = 120000;
    String address = "12104 Polo Dr";
    boolean  isParkNear = false;
    int ratingSchool = 4;
    String houseInfo = "The number of bedrooms are: " + numberBedroom + "\nThe number of bathrooms are: " + numberBathrooms + "\nNumber of kitchen: " + kitchen + "\nIs there a basement? " + isThereABasement + "\nIs the a attic? " + isThereAttic + "\nIs there pool? " + isTherePool + "\nIs house for sale " + isTheHouseForSale + "\nCost of the house $" + prices + "\nAddress is " + address + "\nIs a park near? " + isParkNear + "\nRating of school: " + ratingSchool;
        System.out.println(houseInfo );
        
    }

}
