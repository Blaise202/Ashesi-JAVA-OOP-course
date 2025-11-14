package WordProblems.Inheritance;

// ---- Shuttle ----
public class Shuttle extends Vehicle {
    private int capacity;

    public Shuttle(String id, String driver, VehicleType type, int capacity) {
        super(id, driver, type);
        this.capacity = capacity;
    }

    // TODO: override accelerate() to increase speed by 5
    // TODO: override brake() using super.brake() but also print a message
}

