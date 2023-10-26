public class GasPoweredCar extends Car{

    private double avgMPG;
    private int cylinders;

    public GasPoweredCar(String description, double avgMPG, int cylinders) {
        super(description);
        this.avgMPG = avgMPG;
        this.cylinders = cylinders;
    }
}
