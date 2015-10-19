package raig.org;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;


@RunWith(DataProviderRunner.class)
public class FizzBuzzTest {

  private CalculateInterface fizzBuzzFactory () {

    List<CalculateInterface>  list = new ArrayList();
    list.add(new FizzHook(
      new NullHook(),
      new MultipleThree()
    ));
    list.add(new BuzzMultipleHook(
      new NullHook()
    ));
    list.add(new BangHook(new NullHook()));

    return new FizzBuzzHook(
      new NoiseHook(
        list
      ),
      new IntegerHook(
        new IntToSring()
      )
    );
  }

  @Test
  public void  when_1_is_supplied_should_return_1() {

    CalculateInterface fizzBuzz = fizzBuzzFactory();
    String result  =  fizzBuzz.say(1);
    Assert.assertEquals("1", result);
  }

  @Test
  @UseDataProvider("dataProviderFizzBuzz")
  public void testDataProvider(int number, String resultExpected) {

    CalculateInterface fizzBuzz = fizzBuzzFactory();
    String result  =  fizzBuzz.say(number);
    Assert.assertEquals(resultExpected, result);

  }

  @DataProvider
  public  static Object[][] dataProviderFizzBuzz() {
    // @formatter:off
    return new Object[][]{
      {1, "1"},
      {2, "2"},
      {3, "Fizz"},
      {6, "Fizz"},
      {7, "Bang"},
      {5, "Buzz"},
      {10, "Buzz"},
      {14, "Bang"},
      {15, "FizzBuzz"},
      {3*5*7, "FizzBuzzBang"},

    };

  }
}
