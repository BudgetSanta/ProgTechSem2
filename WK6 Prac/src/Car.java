import java.util.Scanner;

public class Car {

  // New keyboard input instance
  public static Scanner kb = new Scanner(System.in);

  public static void main(String[] args) {

	printLine("Hello World");

    kb.close();
  }


  /**
    Constructor
    @param carMake  [Int]  - The make of the car
    @param carModel [Int]  - The model of the car
    @param carYear  [Str]  - The production year of the car
  */

  String make;
  String model;
  int year;

  public Car (String carMake, String carModel, int carYear) {
    this.make = carMake;
    this.model = carModel;
    this.year = carYear;
  }

  // ##### SETTERS #####
  // ###################

  // Car make Setter
  public void setMake(String carMake) {
    this.make = carMake;
  }

  // Car model Setter
  public void setModel(String carModel) {
    this.model = carModel;
  }

  // Car year setter
  public void setYear(int carYear) {
    this.year = carYear;
  }

  // ##### GETTERS #####
  // ###################

  // Car make Getter
  public String getMake() {
    return make;
  }

  // Car model Getter
  public String getModel() {
    return model;
  }

  // Car year Getter
  public int getYear() {
    return year;
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
