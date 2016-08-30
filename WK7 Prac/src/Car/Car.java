import java.util.Scanner;

public class Car {

  public Scanner kb = new Scanner(System.in);

  String make;
  int yearModel;
  int speed;
  // MAKE, MODEL, YEAR CONSTRUCTOR
  public Car (String carMake, int carYear, int carSpeed) {
    make = carMake;
    yearModel = carYear;
    speed = carSpeed;
  }

  // MAKE, MODEL CONSTRUCTOR
  public Car (String carMake, int carYear) {
    make = carMake;
    yearModel = carYear;
    speed = 0;
  }

  // EMPTY CONSTRUCTOR
  public Car () {
    make = "Subaru";
    yearModel = 2016;
    speed = 50;
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
  public int getYear() {
    return yearModel;
  }

  // Car year Getter
  public int getSpeed() {
    return speed;
  }

  // ##### METHODS #####
  // ###################

  // Car preset accelerate method
  public void accelerate() {
    this.speed += 5;
  }

  // Car variable accelerate method
  public void accelerate(int inputAccelSpeed) {
    this.speed += inputAccelSpeed;
  }

  // Car preset brake method
  public void brake() {
    this.speed -= 5;
  }

  // Car variable brake method
  public void brake(int inputBreakSpeed) {
    this.speed -= inputBreakSpeed;
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

}
