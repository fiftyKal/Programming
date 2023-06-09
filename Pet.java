package week4.week4;
public class Pet {

    private static int numberOFPets = 0;
    //attributes
    private String name;
    private String type;
    private int timesPraised;

    //constructor
    public Pet(String type, String name, int timesPraised) {
        this.type = type;
        this.name = name;
        this.timesPraised = timesPraised;
        numberOFPets++;
    }

    public static int petNumber() {
        return numberOFPets;
    }

    //other methods
    public void calledGoodPet(int number) {
        timesPraised += number;
    }

    //toString method
    public String toString() {
        return name + " is a " + type + " and the pet has been praised " + timesPraised + " times.";
    }

    public static void main(String[] args) {

        Pet cat2 = new Pet("Cat", "Batman", 1);
        cat2.calledGoodPet(1);
        System.out.println(Pet.petNumber());
    }

}