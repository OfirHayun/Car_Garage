public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "  - name: " + name;
    }

    @Override
    public void fixed() {
        System.out.println("Car has been repaired. \nAll systems are operational, and the car is ready for a smooth ride.");
    }

    @Override
    public int getFixTime() {
        return 5;
    }
}
