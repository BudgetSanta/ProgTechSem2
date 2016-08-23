import java.util.Scanner;

public class Car {

  // New keyboard input instance
  public static Scanner kb = new Scanner(System.in);

  public static void main(String[] args) {

  	/**
    Demonstrate"
     - Create car
     - call accel 5*
        -> print each iter
     - call brake 5*
        -> print current speed each iter
    */

    Car myCar = new Car("myMake", 2000);
    for (int i = 0; i < 10; i++) {
      if (i < 5) {
        myCar.accelerate();
      }
      else {
        myCar.brake();
      }
      printLine("" + myCar.getSpeed());
    }

    kb.close();
  }


  /**
    Constructor
    @param carMake  [Int]  - The make of the car
    @param carModel [Int]  - The model of the car
    @param carYear  [Str]  - The production year of the car
  */

  String make;
  int yearModel;
  int speed;

  public Car (String carMake, int carYear) {
    make = carMake;
    yearModel = carYear;
    speed = 0;
  }

  // ##### ACCESSORS #####
  // ###################

  // Car make Setter
  public void setMake(String carMake) {
    this.make = carMake;
  }

  // Car model Setter
  public void setYear(int carYear) {
    this.yearModel = carYear;
  }

  // Car speed setter
  public void setSpeed(int carSpeed) {
    this.speed = carSpeed;
  }

  // ##### MUTATORS #####
  // ###################

  // Car make Getter
  public String getMake() {
    return make;
  }

  // Car model Getter
  public int getModel() {
    return yearModel;
  }

  // Car year Getter
  public int getSpeed() {
    return speed;
  }

  // Car accelerate method
  public void accelerate() {
    speed += 5;
  }

  // Car brake method
  public void brake() {
    speed -= 5;
  }

  // ##### INPUTS #####
  // ###################

  // Shorter String input
  public String getStr(String prompt) {
    System.out.print(prompt);
    return kb.next();
  }

  // Shorter Int input
  public int getInt(String prompt) {
    System.out.print(prompt);
    return kb.nextInt();
  }

  // Shorter println
  public static void printLine(String message){
    System.out.println(message);
  }
}
