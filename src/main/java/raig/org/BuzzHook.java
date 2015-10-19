package raig.org;

public class BuzzHook implements CalculateInterface {

  private CalculateInterface decorated;

  public BuzzHook(CalculateInterface decorated)
  {
    this.decorated = decorated;
  }

  @Override
  public String say(int number) {
    if ( number == 5 ) {
      return "Buzz";
    }
    return decorated.say(number);
  }
}
