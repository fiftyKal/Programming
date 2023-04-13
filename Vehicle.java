package classes;

public class Vehicle {
    // Attributes
    private static String newOwner;
    private int numOfWheels;
    private String type;
    private String color;
    private String owner;


    // Constructor
    public Vehicle(int numOfWheels, String type, String color, String owner) {
        this.numOfWheels = numOfWheels;
        this.type = type;
        this.color = color;
        this.owner = owner;

    }
    // Second Constructor
    public Vehicle(int numOfWheels, String type, String color, String owner, String newOwner) {
        this.numOfWheels = numOfWheels;
        this.type = type;
        this.color = color;
        this.owner = owner;
        this.newOwner = newOwner;
    }
    // Other Methods
    // Change Owner
    public void sellVehicle(String owner) {
        this.owner = owner;
        this.newOwner = owner;

    }


    // toString() method
    public String toString() {
        return owner + " has a " + color + " colored " + type + " that has " + numOfWheels + " wheels. " + "\n";

    }

}
