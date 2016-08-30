public class Member {

  public String fName;
  public String lName;
  public int age;
  public String type;
  public float weight;
  public float fee;

  public Member (String firstName, String lastName, int inputAge, String inputType, float inputWeight, float membershipFee) {

    fName = firstName;
    lName = lastName;
    age = inputAge;
    type = inputType;
    weight = inputWeight;
    fee = membershipFee;

  }

  public String getFirstName () {
    return fName;
  }

  public String getLastName () {
    return lName;
  }

  public String getType () {
    return type;
  }

  public float getFee () {
    return fee;
  }

}
