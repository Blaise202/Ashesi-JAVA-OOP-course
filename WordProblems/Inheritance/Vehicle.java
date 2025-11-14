package WordProblems.Inheritance;

// ---- Base class ----
public class Vehicle {
    protected String id;
    protected String driver;
    protected int speed;
    protected VehicleType type;

    public Vehicle(String id, String driver, VehicleType type) {
        this.id = id;
        this.driver = driver;
        this.speed = 0;
        this.type = type;
    }

    public void accelerate() {
        speed += 10;
    }

    public void brake() {
        speed = Math.max(0, speed - 5);
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return id + " driven by " + driver + " @ " + speed + "km/h";
    }
}

enum VehicleType {
    SHUTTLE,
    PATROL_PICKUP,
    MAINTENANCE_VAN
}
