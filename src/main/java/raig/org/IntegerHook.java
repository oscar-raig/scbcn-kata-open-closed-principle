package raig.org;

public class IntegerHook implements CalculateInterface {

  private IntToSring intToString;

  public IntegerHook(IntToSring conversion)
  {
    intToString = conversion;
  }

  public String say(int number) {
    return intToString.convert(number);
  }
}
