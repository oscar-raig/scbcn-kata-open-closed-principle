package raig.org;

public class BuzzMultipleHook implements CalculateInterface{
  private CalculateInterface decorated;

  public BuzzMultipleHook(CalculateInterface decorated)
  {
    this.decorated = decorated;
  }

  @Override
  public String say(int number) {
    if ( number % 5 == 0 ) {
      return "Buzz";
    }
    return decorated.say(number);
  }
}
