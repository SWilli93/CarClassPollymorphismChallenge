public class Car {

    private String description;

    public Car() {
    }

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("vroooooommm... Engine has been started");
    }

    public void drive() {
        runEngine();
        System.out.println(getClass().getSimpleName() + " is now accelerating");
    }

    protected void runEngine() {
        System.out.println("Engine is running");
    }
}
