package fizzBuss;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by liyue on 2018/1/12
 */
public class FizzBussTest {

  @Test
  public void TestDivByThree(){
    int number = 3;
    String result = FizzBuss.fizzBuzz(number);

    Assert.assertEquals(result,"Fizz");
  }

  @Test
  public void TestDivByFive(){
    int number = 5;
    String result = FizzBuss.fizzBuzz(number);

    Assert.assertEquals(result,"Buzz");
  }

  @Test
  public void TestDivByThreeAndFive(){
    int number = 15;
    String result = FizzBuss.fizzBuzz(number);

    Assert.assertEquals(result,"FizzBuzz");
  }

  @Test
  public void TestDivByOthers(){
    int number = 7;
    String result = FizzBuss.fizzBuzz(number);

    Assert.assertEquals(result,"7");
  }

}
