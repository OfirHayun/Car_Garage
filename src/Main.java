import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        String name = "NA";
        int input;

        do {
            System.out.println("\nGarage menu:\n" +
                    "1-> Motorcycle\n" +
                    "2-> Truck\n" +
                    "3-> Car\n" +
                    "0-> Exit");

            input = scanner.nextInt();
            scanner.nextLine();
            Vehicle vehicle = null;

            if (input != 0) {
                System.out.println("Enter vehicle name:");
                name = scanner.nextLine();
            }


            switch (input) {
                case 1 -> {
                    vehicle = new Motorcycle(name);
                    break;
                }
                case 2 -> {
                    vehicle = new Truck(name);
                    break;
                }
                case 3 -> {
                    vehicle = new Car(name);
                    break;
                }
                case 0 -> {
                    System.out.println("All vehicles have been inserted to DB.");
                    break;
                }
                default -> {
                    continue;
                }
            }

            if (input != 0) {
                DB.addVehicle(vehicle);
                System.out.println("Inserted -\n" + vehicle.toString());
            }

        } while (input != 0);

        Garage garage = new Garage(DB.getVehicles());
        garage.fixed();



    }


}