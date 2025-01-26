public class Motorcycle extends Vehicle{

    public Motorcycle(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return "Motorcycle:\n" +
                "  - name: " + name;
    }

    public void fixed() {
        System.out.println("Car has been repaired. \nAll systems are operational, and the car is ready for a smooth ride.");
    }

    @Override
    public int getFixTime() {
        return 3;
    }
}
