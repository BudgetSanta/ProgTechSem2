//  Student ID: 18347500
//  Name: Jared Steiner
//  Campus: Parramatta
//  Tutor Name: Jordan Collier
//  Class Day: Tuesday
//  Class Time: 9am

import java.util.Scanner;

public class Car_18347500 {

  String make;
  Integer yearModel;
  Integer speed;
  // MAKE, MODEL, YEAR CONSTRUCTOR
  public Car_18347500 (String carMake, Integer carYear, Integer carSpeed) {
    make = carMake;
    yearModel = carYear;
    speed = carSpeed;
  }

  // MAKE, MODEL CONSTRUCTOR
  public Car_18347500 (String carMake, Integer carYear) {
    make = carMake;
    yearModel = carYear;
    speed = 0;
  }

  // EMPTY CONSTRUCTOR
  public Car_18347500 () {
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
  public void setYear(Integer carYear) {
    this.yearModel = carYear;
  }

  // Car speed setter
  public void setSpeed(Integer carSpeed) {
    this.speed = carSpeed;
  }

  // ##### MUTATORS #####
  // ###################

  // Car make Getter
  public String getMake() {
    return make;
  }

  // Car model Getter
  public Integer getYear() {
    return yearModel;
  }

  // Car year Getter
  public Integer getSpeed() {
    return speed;
  }

  // ##### METHODS #####
  // ###################

  // Car preset accelerate method
  public void accelerate() {
    this.speed += 5;
  }

  // Car variable accelerate method
  public void accelerate(Integer inputAccelSpeed) {
    this.speed += inputAccelSpeed;
  }

  // Car preset brake method
  public void brake() {
    this.speed -= 5;
  }

  // Car variable brake method
  public void brake(Integer inputBreakSpeed) {
    this.speed -= inputBreakSpeed;
  }

}
