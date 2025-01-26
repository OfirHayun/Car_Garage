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
        System.out.println("Motorcycle has been repaired. \nAll systems are operational, and the motorcycle is ready for the road.");
    }

    @Override
    public int getFixTime() {
        return 3;
    }
}
