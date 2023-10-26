public class GasPoweredCar extends Car{

    private double avgMPG;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgMPG, int cylinders) {
        super(description);
        this.avgMPG = avgMPG;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Key in the ignition and turned, all %d cylinders are firing %n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.println("Engine Rattling, car gently shakes");
    }
}
