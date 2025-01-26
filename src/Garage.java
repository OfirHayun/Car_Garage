import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.time.Clock.tick;

public class Garage implements Protocol_Garage{

    ArrayList<Vehicle> vehicles;
    private Protocol_Garage protocol;
    private int currentIndex = 0;
    private double remainingFixTime = 0;
    private ScheduledExecutorService executor;


    public Garage(ArrayList<Vehicle> vehicles, Protocol_Garage protocol) {
        this.vehicles = vehicles;
        this.protocol = protocol;
    }

    public void start() {
        executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(() -> {
            try {
                tick();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    private void tick() throws InterruptedException {
        if (currentIndex < vehicles.size()) {
            Vehicle currentVehicle = vehicles.get(currentIndex);

            if (remainingFixTime == 0) {
                remainingFixTime = currentVehicle.getFixTime();
                System.out.println("Repairing: " + currentVehicle.getName());
            }

            remainingFixTime--;

            if (remainingFixTime == 0) {
                ((Fixable) currentVehicle).fixed();
                currentIndex++;
            }
        }
        else {
            protocol.fixed();
            stop();
        }
    }

    private void stop() {
        if (executor != null && !executor.isShutdown()) {
            executor.shutdown();
            System.out.println("The garage stopped working.");
        }
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
