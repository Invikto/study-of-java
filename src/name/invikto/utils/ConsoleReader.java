package name.invikto.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.*;
import static name.invikto.utils.ConsoleLogger.*;

public class ConsoleReader {
  private static final Scanner scanner = new Scanner(in);

  public static String getStringInput(String prompt) {
    out.println(prompt);
    try {
      return scanner.nextLine();
    } catch (RuntimeException error) {
      logError(error);
    }
    return null;
  }

  public static int getIntInput(String prompt) {
    out.println(prompt);
    try {
      return scanner.nextInt();
    } catch (InputMismatchException error) {
      out.println("It's not an integer.");
      logError(error);
    } catch (RuntimeException error) {
      logError(error);
    }
    return 0;
  }
}
