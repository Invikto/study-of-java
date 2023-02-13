package name.invikto.utils;

import java.util.Arrays;

import static name.invikto.utils.ConsoleLogger.logError;

public class ArrayProcessor {
  public static int getArrElementSum(int[] ints) {
    try {
      return Arrays.stream(ints).sum();
    } catch (NullPointerException error) {
      logError(error);
    }
    return 0;
  }
}
