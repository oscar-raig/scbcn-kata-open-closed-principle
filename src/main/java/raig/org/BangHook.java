package raig.org;

public class BangHook implements CalculateInterface {
  private CalculateInterface decorated;

  public BangHook(CalculateInterface decorated)
  {
    this.decorated = decorated;
  }

  @Override
  public String say(int number) {
    if ( number % 7 == 0 ) {
      return "Bang";
    }
    return decorated.say(number);
  }
}
