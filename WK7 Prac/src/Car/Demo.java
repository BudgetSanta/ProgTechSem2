import java.util.Scanner;

public class Demo {

  public static Scanner kb = new Scanner(System.in);

  public static void main(String[] args) {

    // CAR CREATION
    Car carOne = new Car();                            // Preset Car

    System.out.println("MAKE, YEAR AND SPEED");
    Car carTwo = new Car(                              // User made car
      getStr("What is this car's make? "),
      getInt("What year was this car made? "),
      getInt("What is this car's current speed? ")
    );

    System.out.println("MAKE AND YEAR");
    Car carThree = new Car(                            // User made make, year
      getStr("What is this car's make? "),
      getInt("What year was this car made? ")
    );

    // INVENTORY OUTPUT
    System.out.println("OUTPUT: Cars in invetory");
    getCar(carOne);
    getCar(carTwo);
    getCar(carThree);

    // --------------------------------------------------------
    // ACCELERATE DEMO. speed, static accel, speed, var accel, speed
    System.out.println("");
    System.out.println("DEMO: accelerate mutators");
    System.out.println("Car One Speed: " + carOne.getSpeed());
    System.out.println("Preset Accelerating by 5km/h...");
    carOne.accelerate();
    System.out.println("Car One Speed: " + carOne.getSpeed());
    int demoUserAccel;
    do {
      demoUserAccel = getInt("Enter acceleration speed: ");
    } while (demoUserAccel < 0);
    carOne.accelerate(demoUserAccel);
    System.out.println("Accelerating by " +  demoUserAccel + " km/h...");
    System.out.println("Car One Speed: " + carOne.getSpeed());

    // ---------------------------------------------------------
    // BRAKE DEMO. speed, static brake, speed, var brake, speed
    System.out.println("");
    System.out.println("DEMO: brake mutators");
    System.out.println("Car One Speed: " + carOne.getSpeed());
    System.out.println("Preset Braking...");
    carOne.brake();
    System.out.println("Car One Speed: " + carOne.getSpeed());
    int demoUserBrake;
    do {
      demoUserBrake = getInt("Enter brake speed: ");
    } while (demoUserBrake < 0);
    carOne.brake(demoUserBrake);
    System.out.println("Braking by " +  demoUserBrake + "km/h...");
    System.out.println("Car One Speed: " + carOne.getSpeed());

    // ---------------------------------------------------------
    // SETTER DEMO. attributes, set attributes, attributes
    System.out.println("");
    System.out.println("DEMO: Individual setters");   // Much better than settlers
    System.out.println("...... Car Three ......");
    getCar(carThree);

    System.out.print("Set Make: ");
    carThree.setMake(kb.next());

    System.out.print("Set Year: ");
    carThree.setYear(kb.nextInt());

    System.out.print("Set Speed: ");
    carThree.setSpeed(kb.nextInt());

    getCar(carThree);


    // FINAL OUTPUT BEFORE TEMINATION
    System.out.println("OUTPUT: Cars in invetory");
    getCar(carOne);
    getCar(carTwo);
    getCar(carThree);
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
  public static String getStr(String prompt) {
    System.out.print(prompt);
    return kb.next();
  }

  // Shorter Int input
  public static int getInt(String prompt) {
    System.out.print(prompt);
    return kb.nextInt();
  }

}
