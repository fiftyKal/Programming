package classes;

import java.util.ArrayList;
public class VehicleTester {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        Vehicle bike = new Vehicle(2,"Bycicle","Pink","Kitty Foreman");
        vehicleList.add(bike);
        Vehicle ford = new Vehicle(4,"Ford Truck","Red","Peter Griffin");
        vehicleList.add(ford);
        Vehicle unicycle = new Vehicle(1,"Unicycle","Blue","Dale Belieu");
        vehicleList.add(unicycle);
        Vehicle trailBlazer = new Vehicle(4,"Trail Blazer","Maroon","Ruby Essick");
        vehicleList.add(trailBlazer);
        Vehicle subaru = new Vehicle(4,"Subaru","Cobalt Blue","Issac Quijano");
        vehicleList.add(subaru);

        System.out.println(vehicleList);

        ford.sellVehicle("Nick Cannon");
        System.out.println(ford);

    }
}
