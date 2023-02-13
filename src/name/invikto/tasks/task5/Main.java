package name.invikto.tasks.task5;

import static java.lang.System.out;
import static name.invikto.entities.Months.getMonthByIndex;
import static name.invikto.utils.ConsoleReader.getIntInput;

public class Main {
  public static void main(String[] args) {
    int number = getIntInput("Month number from 1 to 12:");
    try {
      out.println(getMonthByIndex(number));
    } catch (Exception error) {
      out.println("Incorrect month number.");
    }
  }
}
