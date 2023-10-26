public class HybridCar extends Car{

    private double avgMPG;
    private int batteryLevel;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgMPG, int batteryLevel, int cylinders) {
        super(description);
        this.avgMPG = avgMPG;
        this.batteryLevel = batteryLevel;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Push to Start pressed, center console gently illuminates and displays 'Hello Watson', battery at %d Percent, all %d firing, Engine gently vrooooms%n", batteryLevel, cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.println("Engine cuts out and car silently Idles");
    }
}
