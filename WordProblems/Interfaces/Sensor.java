package WordProblems.Interfaces;
// ---- Core interface ----
public interface Sensor {
    int DEFAULT_READING = 0;
    String CAMPUS_NAME = "Ashesi University";

    int readValue();
    String getLocation();

    default boolean isCritical() {
        return false;
    }

    default String summary() {
        return "[Sensor @ " + getLocation() + "] reading=" + readValue();
    }
}

// ---- Capability interfaces ----
interface HasBattery {
    int getBatteryLevel();

    default boolean needsCharging() {
        return getBatteryLevel() < 20;
    }
}

interface Wireless {
    String getSignalStrength();
}
