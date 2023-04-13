package quiz3;

import java.util.Arrays;
import java.lang.Comparable;
public class Vehicle implements Comparable<Vehicle> {

    //Attributes
    private int numberOfWheels;
    private String type;
    private String color;
    private String owner;

    //Constructor
    public Vehicle(int wheels, String type, String owner) {
        this.numberOfWheels = wheels;
        this.type = type;
        this.owner = owner;
    }
    public String getOwner() {
        return this.owner;
    }

    //Other Methods

    public int compareTo(Vehicle other) {
        if (!this.owner.equalsIgnoreCase(other.owner))
            return this.owner.compareTo(other.owner);
        return this.numberOfWheels - other.numberOfWheels;
    }

    public void changeOrder(String newName) {
        owner = newName;
    }

    //toString
    public String toString() {
        return type + " that has " + numberOfWheels + " wheels and is owned by " + owner;
    }



    public static void main(String[] args) {
        Vehicle[] vehicles = {new Vehicle(4, "car", "Suzy"),
                new Vehicle(2, "bicycle", "Tommy"),
                new Vehicle(4, "truck", "Adele")};

        System.out.println(Arrays.toString(vehicles));
        Arrays.sort(vehicles);
        System.out.println(Arrays.toString(vehicles));
    }


}

