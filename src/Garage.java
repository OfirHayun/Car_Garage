import java.util.ArrayList;

public class Garage implements Protocol_Garage{

    ArrayList<Vehicle> vehicles;

    public Garage(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public void fixed() throws InterruptedException {

        for( Vehicle v : vehicles) {
            System.out.println("Repairing: \n" + v.getName());
            Thread.sleep((long)v.getFixTime()*1000);
            v.fixed();

            Thread.sleep((long)1000);
        }

        System.out.println("All vehicles have been repaired.");

    }
}
