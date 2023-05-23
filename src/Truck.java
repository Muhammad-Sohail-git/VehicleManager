public class Truck extends Vehicle{
    private double maxLoadCapacity;

    public Truck(String noPlate, int noOfPlaces, double maxLoadCapacity) {
        super(noPlate, noOfPlaces);
        this.maxLoadCapacity = maxLoadCapacity;
    }
    @Override
    public String toString() {
        return "Number Plate: " + getnoPlate() + " : " + "Number of Places: " + getnoOfPlaces() + " : " + "MaxLoadCapacity= " + maxLoadCapacity;
    }
}
