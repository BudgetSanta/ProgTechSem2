public class Member {

  public String fName; // first name string
  public String lName; // last name string
  public int age;      // age integer primitive
  public String type;  // type(gym/circuit) string
  public float weight; // weight float
  public float fee;    // fee float


  // Fully specified Member Constructor
  public Member (String firstName, String lastName, int inputAge, String inputType, float inputWeight, float membershipFee) {

    fName = firstName;              // first name string
    lName = lastName;               // last name string
    age = inputAge;                 // age integer primitive
    type = inputType;               // type(gym/circuit) string
    weight = inputWeight;           // weight float (hahaha,not if they're heavy)
    fee = membershipFee;            // fee float

  }

  // Get first name
  public String getFirstName () {
    return fName;
  }

  // Get last name
  public String getLastName () {
    return lName;
  }

  // Get type
  public String getType () {
    return type;
  }

  // get Fee
  public float getFee () {
    return fee;
  }

  // weight getter not needed
  // no setters needed, only file input used to create members complete member objects.

}
