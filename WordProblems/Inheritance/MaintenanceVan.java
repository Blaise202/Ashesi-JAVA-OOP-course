package WordProblems.Inheritance;

// ---- Maintenance Van ----
public class MaintenanceVan extends Vehicle {
    private double equipmentWeight;

    public MaintenanceVan(String id, String driver, VehicleType type, double weight) {
        super(id, driver, type);
        this.equipmentWeight = weight;
    }

    // TODO: use super.accelerate() then reduce speed gain if weight > 200
}
