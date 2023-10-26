public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lamborghini");

        peelOff(car);
    }

    public static void peelOff(Car car) {
        car.startEngine();
        car.drive();
    }
}
