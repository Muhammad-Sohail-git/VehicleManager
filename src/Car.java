public class Car extends Vehicle{
    private int noOfDoors;

    public Car(String noPlate, int noOfPlaces, int noOfDoors) {
        super(noPlate, noOfPlaces);
        this.noOfDoors = noOfDoors;
    }
    @Override
    public String toString() {
        return "Number Plate: " + getnoPlate() + " : " + "Number of Places: " + getnoOfPlaces() + " : " + "noOfDoors=" + noOfDoors;
    }
}
