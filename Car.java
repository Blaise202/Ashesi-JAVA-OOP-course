public class Car{
  private String make;
  private String model;
  private double engineSize;
  private double price;
  private String carNumber;
  private double speed;
  
  void Car(){}

  void Car(String make, String model){
    this.make = make;
    this.model = model;
  }

  public double brake(double decreaseBy){
    if(this.speed - decreaseBy >= 0){
      this.speed -= decreaseBy;
    }else{
      this.speed = 0;
    }
    return this.speed;
  }
  public double accelerate(double increaseBy){
    this.speed += increaseBy;
    return this.speed;
  }
  public double gear(){}
  public String toString(){
    return "";
  }
  public double accessors(){}
  public double auxilliary(){}

}
