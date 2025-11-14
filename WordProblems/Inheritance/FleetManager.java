package WordProblems.Inheritance;

import java.util.ArrayList;
import java.util.List;

// ---- Fleet Manager ----
public class FleetManager {

  public static void main(String[] args){

    // an ArrayList to hold different types of Vehicle objects
    List<Vehicle> vehicles = new ArrayList<>();

    // TODO: store a list of Vehicles into an array (1 each type)
    Vehicle patrolPickup = new PatrolPickup(
      "253", "Blaise", VehicleType.PATROL_PICKUP, TRUE
    );

    // TODO: add vehicles
    vehicles.add(patrolPickup);

    // TODO: print all vehicles using a loop
    for(Vehicle vehicle : vehicles){
      vehicle.toString();
    }

    // Take Home Tasks:
    // TODO: Further implementation to test accelerate and brake methods on each vehicle
    // TODO: Further implementation to print vehicle details after each operation
  } 
}
