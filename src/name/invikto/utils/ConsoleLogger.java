package name.invikto.utils;

import name.invikto.entities.ConsoleColors;

import static java.lang.System.err;
import static java.text.MessageFormat.format;

public class ConsoleLogger {
  public static void logError(Throwable error) {
    err.println(ConsoleColors.RED.getCodeSequence());
    err.println(format("Error occurred: {0}", error));
    error.printStackTrace();
    err.println(ConsoleColors.DEFAULT.getCodeSequence());
  }
}
