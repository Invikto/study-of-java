package name.invikto.utils;

import java.util.Arrays;

import static java.lang.System.out;
import static name.invikto.utils.ConsoleLogger.logError;

public class DataTypeConverter {
  public static int[] convertStringArrToIntArr(String[] strings) {
    try {
      return Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
    } catch (NullPointerException error) {
      logError(error);
    } catch (NumberFormatException error) {
      out.println("One of the array element can't be converted to an integer.");
      logError(error);
    }
    return new int[0];
  }
}
