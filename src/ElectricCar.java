public class ElectricCar extends Car{

    private double avgMilesPerCharge;
    private int batteryLevel;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgMilesPerCharge, int batteryLevel) {
        super(description);
        this.avgMilesPerCharge = avgMilesPerCharge;
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void startEngine() {
        System.out.printf("Push to Start pressed, center console gently illuminates and displays 'Hello Watson', battery at %d Percent%n", batteryLevel);
    }

    @Override
    protected void runEngine() {
        System.out.println("Car silently Idles");

    }
}
