package name.invikto.tasks.task3;

import java.util.Random;
import java.util.stream.IntStream;

import static java.lang.System.out;
import static name.invikto.utils.ConsoleReader.getIntInput;

public class Main {
  public static void main(String[] args) {
    var prompt = "Number of numbers:";
    int n = getIntInput(prompt);
    if (n > 0) {
      out.println("Numbers:");
      var random = new Random();
      IntStream.range(0, n).map(i -> random.nextInt(1000)).forEach(out::println);
    } else {
      out.println("There aren't numbers.");
    }
  }
}
