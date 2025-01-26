public abstract class Vehicle implements Fixable {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle:\n" +
                "  - name: " + name;
    }


    public abstract int getFixTime();


}
