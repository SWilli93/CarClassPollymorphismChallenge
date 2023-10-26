public class ElectricCar extends Car{

    private double avgMilesPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgMilesPerCharge, int batterySize) {
        super(description);
        this.avgMilesPerCharge = avgMilesPerCharge;
        this.batterySize = batterySize;
    }
}
