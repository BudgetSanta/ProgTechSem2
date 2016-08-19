
public class Constructors {

  // Constructors have the same name as the class
  // Constructors have NO RETURN TYPE (not even void)
  // Constructors may not return any values
  // Constructors are typically PUBLIC

  // Different variables for in and out of methods e.g.
  /**
        IN     |     OUT
    -------------------------
      fName    |  firstName
      lName    |  lastName
        ID     |  personID
  */

  // BINDING With multiple methods and the same name happens at run time. so if it's valid in at least one method it will run

  public static void main(String[] args) {

    Employee person = new Employee(54545, "Bob", "Down", 7.5);
    System.out.println(person.getStaffID());
    System.out.println(person.getFirstName());
  }

  /**
    Constructor
    @param ID    - The eployees staff ID
    @param fName - The employees first name
    @param sName - The employees surname
    @param leave - The employees annual leave
  */
  public Employee(int ID, String fName, String sName, double leave) {

    staffID = ID;
    firstName = fName;
    surname = sName;
    annualLeave = leave;
    longServiceLeave = 10.0;
    System.out.println("Employee Object Created");

  }

  public int getStaffID() {
    return staffID;
  }

  public

}
