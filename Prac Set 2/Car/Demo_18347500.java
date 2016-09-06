//  Student ID: 18347500
//  Name: Jared Steiner
//  Campus: Parramatta
//  Tutor Name: Jordan Collier
//  Class Day: Tuesday
//  Class Time: 9am

import java.util.Scanner;
import java.io.*;

public class Demo_18347500 {

  public static Scanner kb = new Scanner(System.in);

  public static void main(String[] args) throws IOException{

    // assign cars from carCreation()
    Car[] garage = carCreation();       // Three car output from carCreation

    // INVENTORY OUTPUT
    System.out.println("OUTPUT: Cars in invetory");
    getCar(garage[0]);
    getCar(garage[1]);
    getCar(garage[2]);

    // DEMONSTRATIONS
    garage[0] = accelDemo("Car One", garage[0]);
    garage[0] = brakeDemo("Car One", garage[0]);
    garage[1] = setterDemo("Car Two", garage[1]);

    // FINAL OUTPUT BEFORE TEMINATION
    System.out.println("OUTPUT: Cars in invetory");
    getCar(garage[0]);
    getCar(garage[1]);
    getCar(garage[2]);
  }

  // Print car details
  public static void getCar(Car carInst) {
    System.out.println(" ----- CAR ----- ");
    System.out.println(" make: " + carInst.getMake());
    System.out.println(" year: " + carInst.getYear());
    System.out.println("speed: " + carInst.getSpeed());
  }

  // ##### INPUTS #####
  // ###################

  // Shorter String input
  public static String getStr(String prompt) throws IOException{
    System.out.print(prompt);
    return kb.next();
  }

  // Shorter VALIDATED Int input
  public static Integer getInteger(String prompt) throws IOException{
    // Takes string input to validate as Int
    try {
      String outStr = "";
      do {
        outStr = getStr(prompt);
      } while (!isInteger(outStr));
      return Integer.parseInt(outStr);
    } catch (Exception e) {             // IF EXCEPTION THROWN, 0 RETURNED
      System.out.println("Error while parsing Integer. INTEGER:0 returned from getInteger");
      return 0;
    }
  }

  static Car[] carCreation() throws IOException{

    Car[] garage = new Car[3];              // Car Object Array to store cars

    // CAR CREATION
    System.out.println("Please enter the following details below for car creation");

    // ### CAR ONE ###
    // Car one uses the blank constructor
    Car carOne = new Car();
    garage[0] = carOne;               // Assigning car to garage slot

    // ### CAR TWO ###
    // Car two uses a completely user generated constructor
    System.out.println("MAKE, YEAR AND SPEED");
    Car carTwo = new Car(
      getStr("What is this car's make? "),
      getInteger("What year was this car made? "),
      getInteger("What is this car's current speed? ")
    );
    garage[1] = carTwo;               // Assigning car to garage slot

    // ### CAR THREE ###
    // Car three uses a semi user generated constructor setting speed to 0
    System.out.println("MAKE AND YEAR");
    Car carThree = new Car(
      getStr("What is this car's make? "),
      getInteger("What year was this car made? ")
    );
    garage[2] = carThree;            // Assigning car to garage slot

    return garage;

  }

  // DEMOs Acceleration mutators
  static Car accelDemo(String carName, Car car) throws IOException{

    // ACCELERATE DEMO. speed, static accel, speed, var accel, speed
    System.out.println("");
    System.out.println("DEMO: accelerate mutators");
    System.out.println("Car One Speed: " + car.getSpeed());

    // First Accel
    System.out.println("Preset Accelerating by 5km/h...");
    car.accelerate();
    System.out.println("Car One Speed: " + car.getSpeed());

    // Second Accel
    int userInputAccel;                 // User defined acceleration speed
    userInputAccel = getInteger("Enter acceleration speed (Integer): ");
    car.accelerate(userInputAccel);
    System.out.println("Accelerating by " +  userInputAccel + " km/h...");

    // Final Speed
    System.out.println("Car One Speed: " + car.getSpeed());

    return car;
  }

  // DEMOs Brake mutators
  static Car brakeDemo(String carName, Car car) throws IOException{

    // BRAKE DEMO. speed, static brake, speed, var brake, speed
    System.out.println("");
    System.out.println("DEMO: brake mutators");
    System.out.println("Car One Speed: " + car.getSpeed());

    // First Brake
    System.out.println("Preset Braking...");
    car.brake();
    System.out.println("Car One Speed: " + car.getSpeed());

    // Second Brake
    int userInputBrake;                   // User defined brake speed
    userInputBrake = getInteger("Enter brake speed (Integer): ");
    car.brake(userInputBrake);
    System.out.println("Braking by " +  userInputBrake + "km/h...");

    // Final Speed
    System.out.println("Car One Speed: " + car.getSpeed());

    return car;

  }

  // DEMOs attribute setters
  static Car setterDemo(String carName, Car car) throws IOException{

    // SETTER DEMO. attributes, set attributes, attributes
    System.out.println("");
    System.out.println("DEMO: Individual setters");   // Much better than settlers
    System.out.println("...... " + carName + " ......");
    getCar(car);

    car.setMake(getStr("Set Make: "));

    // Set car year with int validation
    car.setYear(getInteger("Set Year: "));

    // Set car speed with int validation
    car.setSpeed(getInteger("Set Speed: "));

    // Output car attributes
    getCar(car);

    return car;

  }

  // Validates Strings as Integers
  static boolean isInteger(String strNum) throws IOException{
    try {
      // parse string as int
      Integer integerNum = Integer.parseInt(strNum);
      // if it doesn"t throw an error, return TRUE
      return true;
    }
    catch (NumberFormatException nFE) {
      System.out.println("");
      System.out.println(" ##NumberFormatException: Please enter an Integer");
      return false;
    }
  }

}
