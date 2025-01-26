import java.util.ArrayList;

public abstract class DB {
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public static ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }


    public static void toStringList(){
        System.out.println("Vehicles currently in list:");
        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }
    }

}