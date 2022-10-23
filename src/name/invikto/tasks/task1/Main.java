package name.invikto.tasks.task1;

import static java.lang.System.out;
import static java.text.MessageFormat.format;
import static name.invikto.utils.ConsoleReader.getStringInput;

public class Main {
  public static void main(String[] args) {
    var prompt = "Your name:";
    String input = getStringInput(prompt);
    if (input != null) {
      out.println(format("Hello {0}!", input));
    }
  }
}
