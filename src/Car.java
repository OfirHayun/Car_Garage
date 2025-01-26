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
        System.out.println("Motorcycle has been repaired. \nAll systems are operational, and the motorcycle is ready for the road.");
    }

    @Override
    public int getFixTime() {
        return 5;
    }
}
