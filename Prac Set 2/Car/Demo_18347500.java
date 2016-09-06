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

  public static void main(String[] args) {

    // assign cars from carCreation()
    Car[] garage = carCreation();       // Three car output from carCreation

    // INVENTORY OUTPUT
    System.out.println("\n\nOUTPUT: Cars in invetory");
    getCar(garage[0], "Car One");
    getCar(garage[1], "Car Two");
    getCar(garage[2], "Car Three");

    // DEMONSTRATIONS
    garage[0] = accelDemo("Car One", garage[0]);
    garage[0] = brakeDemo("Car One", garage[0]);
    garage[1] = setterDemo("Car Two", garage[1]);

    // FINAL OUTPUT BEFORE TEMINATION
    System.out.println("\n\nOUTPUT: Cars in invetory");
    getCar(garage[0],"Car One");
    getCar(garage[1],"Car Two");
    getCar(garage[2],"Car Three");
  }

  // Print car details
  public static void getCar(Car carInst, String carName) {
    System.out.println(" ----- " + carName + " ----- ");
    System.out.println(" Make: " + carInst.getMake());
    System.out.println(" Year: " + carInst.getYear());
    System.out.println("Speed: " + carInst.getSpeed());
  }

  // ##### INPUTS #####
  // ###################

  // Shorter String input
  public static String getStr(String prompt) {
    System.out.print(prompt);
    return kb.next();
  }

  // Shorter VALIDATED Int input
  public static int getInt(String prompt) {
    int outputInt = -1;        // while loop continues until value changed to pos int
    while (!isPosInt(outputInt)) {
      System.out.print(prompt);
      outputInt = kb.nextInt();
      if (!isPosInt(outputInt)) {
        System.out.println("## ERROR: Number not positive. Please enter positive integer. ##");
      }
    }
    return outputInt;
  }

  static Car[] carCreation() {
    Car[] garage = new Car[3];              // Car Object Array to store cars
    // CAR CREATION
    System.out.println("Please enter the following details below for car creation");

    // CAR ONE uses the blank constructor
    Car carOne = new Car();
    System.out.println("\nCar One created with blank constructor!");
    garage[0] = carOne;

    // CAR TWO uses a completely user generated constructor
    System.out.println("\nCar Two - Make, Year and Speed");
    Car carTwo = new Car(
      getStr("What is this car's make? "),
      getInt("What year was this car made? "),
      getInt("What is this car's current speed? ")
    );
    garage[1] = carTwo;

    // CAR THREE uses a semi user generated constructor setting speed to 0
    System.out.println("\nCar Three - Make and Year");
    Car carThree = new Car(
      getStr("What is this car's make? "),
      getInt("What year was this car made? ")
    );
    garage[2] = carThree;
    return garage;

  }

  // DEMOs Acceleration mutators
  static Car accelDemo(String carName, Car car) {

    // ACCELERATE DEMO. speed, static accel, speed, var accel, speed
    System.out.println("\n\nDEMO: accelerate mutators");
    System.out.println(carName + " Speed: " + car.getSpeed());

    // First Accel
    System.out.println("Preset Accelerating by 5km/h...");
    car.accelerate();
    System.out.println(carName + " Speed: " + car.getSpeed());

    // Second Accel
    int userInputAccel = getInt("Enter acceleration speed (Integer): ");     // User defined acceleration speed
    car.accelerate(userInputAccel);
    System.out.println("Accelerating by " +  userInputAccel + " km/h...");

    // Final Speed
    System.out.println(carName + " Speed: " + car.getSpeed());
    return car;
  }

  // DEMOs Brake mutators
  static Car brakeDemo(String carName, Car car) {

    // BRAKE DEMO. speed, static brake, speed, var brake, speed
    System.out.println("\n\nDEMO: brake mutators for " + carName);
    System.out.println(carName + " Speed: " + car.getSpeed());

    // First Brake
    System.out.println("Preset Braking...");
    car.brake();
    System.out.println(carName + " Speed: " + car.getSpeed());

    // Second Brake
    int userInputBrake = getInt("Enter brake speed (Integer): ");     // User defined brake speed
    car.brake(userInputBrake);
    System.out.println("Braking by " +  userInputBrake + "km/h...");

    // Final Speed
    System.out.println(carName + " Speed: " + car.getSpeed());
    return car;

  }

  // DEMOs attribute setters
  static Car setterDemo(String carName, Car car) {
    // SETTER DEMO. attributes, set attributes, attributes
    System.out.println("\n\nDEMO: Individual setters for " + carName);   // Much better than settlers
    getCar(car, carName);

    car.setMake(getStr(" Set Make: "));    //Set Car Make
    car.setYear(getInt(" Set Year: "));    // Set car year with int validation
    car.setSpeed(getInt("Set Speed: "));  // Set car speed with int validation
    // Output car attributes
    getCar(car, carName);
    return car;
  }

  // returns true for ints > 0
  static boolean isPosInt(int num) {
    if (num >= 0) {
      return true;
    }
    else {
      return false;
    }
  }

}
