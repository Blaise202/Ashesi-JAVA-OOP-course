package Examrevision;

public class School {
  private String name;
  private ClassRoom room;

  public School(String name, int roomNo){
    this.name = name;
    this.room = new ClassRoom(roomNo);
  }

  public void display(){
    System.out.println("School: " +name);
    room.show();
  }

  public void storeGrades(){
    double[][] grades = {{ 12,32,43 }, {32,34,24}};
    for(int i = 0; i<3; i++){
      double average = (grades[0][i] + grades[1][i])/2;
      System.out.println("Average grade for student "+(i+1)+" is: "+average);
    }
  }
  
  public static void main(String[] args){
    School s = new School("tech", 12);
    s.storeGrades();
  }
}

  // public void storeGrades(){
  //   try {
  //     String[] subjects = new String[2];
  //     Scanner sc = new Scanner(System.in);
  //     for(int i = 0; i < 2; i++){
  //       System.out.print("Enter subject " + (i+1) + ": ");
  //       subjects[i] = sc.nextLine();
  //     }
  //     sc.close();
  //     double[][] marks = new double[2][3];
  //     Scanner markSc = new Scanner(System.in);
  //     for(int i = 0; i < 3; i++){
  //       int count = 0;
  //       for(String subject: subjects){
  //           System.out.print("Enter " + subject +"'s marks for student "+ (i+1) + ": ");
  //           marks[count][i] = markSc.nextDouble();
  //           count++;
  //       }
  //     }
  //     double[] averages = new double[3];
  //     for(int i = 0; i < 3; i++){
  //       double grade1 = marks[0][i];
  //       double grade2 = marks[1][i];
  //       averages[i] = (grade1 + grade2) / 2;
  //     }
  //     int gradeCount = 0;
  //     for(double average: averages){
  //       System.out.println("Average grade for student " + (gradeCount+1) + "is: " + average);
  //       gradeCount++;
  //     }
  //     markSc.close();
  //   } catch (Exception e) {
  //     System.out.println("Exception: " + e);
  //   }
  // }
