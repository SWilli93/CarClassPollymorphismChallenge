public class HybridCar extends Car{

    private double avgMPG;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgMPG, int batterySize, int cylinders) {
        super(description);
        this.avgMPG = avgMPG;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
}
