public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lamborghini");

        peelOff(car);

        GasPoweredCar lamborghini = new GasPoweredCar("Lamborghini", 22, 10);
        peelOff(lamborghini);

        ElectricCar tesla = new ElectricCar("Tesla Model X", 500, 100);
        peelOff(tesla);

        HybridCar corolla = new HybridCar("Toyota Corolla", 52, 100, 8);
        peelOff(corolla);
    }

    public static void peelOff(Car car) {
        car.startEngine();
        car.drive();
    }
}
