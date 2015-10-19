package raig.org;

public class FizzHook implements CalculateInterface {

  private CalculateInterface decorated;
  private MultipleThree multipleThree;
  public FizzHook (CalculateInterface calculateInterface,MultipleThree multipleThree) {
    decorated = calculateInterface;
    this.multipleThree  = multipleThree;

  }
  public String say(int number) {
    if (multipleThree.check(number)) {
      return "Fizz";
    }
    return decorated.say(number);
  }
}
