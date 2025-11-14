package WordProblems.Inheritance;

// ---- Patrol Pickup ----
public class PatrolPickup extends Vehicle {
    private boolean sirensOn;

    public PatrolPickup(String id, String driver, VehicleType type, boolean sirensOn) {
        super(id, driver, type);
        this.sirensOn = sirensOn;
    }

    public boolean getSirensOn(){
      return sirensOn;
    }

    // TODO: if sirensOn: accelerate +20 else normal +10
    // MUST call super.accelerate() at least once
    @Override
    public void accelerate(){
      super.accelerate();
      if(sirensOn){
        speed += 20;
      }else{
        System.out.println("Normal Accerleration");
      }
      System.out.println("The Speed Is Now "+ super.speed);
    }
}

