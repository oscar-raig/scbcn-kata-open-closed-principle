package raig.org;


import java.util.List;

public class NoiseHook implements CalculateInterface {
  List<CalculateInterface> listCalculate;

    public NoiseHook(List <CalculateInterface> listCalculate){
    this.listCalculate = listCalculate;
  }


  @Override
  public String say(int number) {
    String result = "";

    for (CalculateInterface cal : listCalculate) {
      result = result + cal.say(number);
    }

    return result;
  }
}
