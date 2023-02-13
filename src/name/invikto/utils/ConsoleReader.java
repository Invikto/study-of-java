package name.invikto.utils;

import org.jetbrains.annotations.Nullable;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static name.invikto.utils.ConsoleLogger.logError;

public class ConsoleReader {
  private static final Scanner scanner = new Scanner(in);

  public static @Nullable String getStringInput(String prompt) {
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
