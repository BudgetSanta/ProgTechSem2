public class TestScores {

  Double scoreOne;
  Double scoreTwo;
  Double scoreThree;

  // Filled Constructor
  public TestScores (Double resultOne, Double resultTwo, Double resultThree) {

    scoreOne = resultOne;
    scoreTwo = resultTwo;
    scoreThree = resultThree;

  }

  // Empty Constructor
  public TestScores () {
    scoreOne = scoreOne;
    scoreTwo = scoreTwo;
    scoreThree = scoreThree;
  }

  // SETTERS --

  // scoreOne mutator
  public void setOne(Double resultOne) {
    scoreOne = resultOne;
  }

  // scoreTwo mutator
  public void setTwo(Double resultTwo) {
    scoreTwo = resultTwo;
  }

  // scoreThree mutator
  public void setThree(Double resultThree) {
    scoreThree = resultThree;
  }

  // GETTERS --

  // scoreOne accessor
  public double getOne() {
    return scoreOne;
  }

  // scoreTwo accessor
  public double getTwo() {
    return scoreTwo;
  }

  // scoreThree accessor
  public double getThree() {
    return scoreThree;
  }

  // scoreAvg Getter
  public double getAvg() {
    double total = scoreOne + scoreTwo + scoreThree;
    return total/3;
  }

}
