public class Truck extends Vehicle{

    public Truck(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Truck:\n" +
                "  - name: " + name;
    }

    @Override
    public void fixed() {
        System.out.println("Truck has been repaired. \nAll systems are operational, and the truck is ready for use.");

    }

    @Override
    public int getFixTime() {
        return 10;
    }
}
