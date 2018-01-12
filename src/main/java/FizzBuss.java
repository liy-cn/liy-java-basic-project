/**
 * Created by liyue on 2018/1/12
 */
public class FizzBuss {

  public static String fizzBuzz(int number) {
    StringBuffer sb = new StringBuffer();

    if (number % 3 == 0) {
      sb.append("Fizz");
    }

    if(number % 5 == 0) {
      sb.append("Buzz");
    }

    if ("".equals(sb.toString())) {
      sb.append(String.format("%d",number));
    }

    return sb.toString();
  }
}
