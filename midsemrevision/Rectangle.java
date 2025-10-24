public class Rectangle{
  private double length;
  private double width;

  public Rectangle(double length, double width){
    this.length = length;
    this.width = width;
  }

  public double getArea(){
    return length * width;
  }

  public boolean isSquare(){
    if(width == length)
      return true;
    else
      return false;
  }

  public void display() {
    System.out.println("--- Rectangle Info ---");
    System.out.println("Dimensions: " + this.length + " x " + this.width);
    System.out.println("Area: " + getArea());
    System.out.println("Is a square: " + isSquare());
    System.out.println("----------------------");
  }

  public static void main(String[] args){
    Rectangle r1 = new Rectangle(12.34,12);
    Rectangle r2 = new Rectangle(10, 20);

    r1.display();
    r2.display();
  }
}