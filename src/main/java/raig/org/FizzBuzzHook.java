package raig.org;

public class FizzBuzzHook implements CalculateInterface {

  CalculateInterface buzz;
  CalculateInterface fizz;
  CalculateInterface inthook;

  public FizzBuzzHook(CalculateInterface fizz, CalculateInterface inthook){
    this.fizz = fizz;
    this.inthook = inthook;
  }

  public String say(int number){
    String result = fizz.say(number);

    if (result.equals("")){
      return inthook.say(number);
    }

    return result;
  }

}
