package name.invikto.tasks.task4;

import static java.lang.System.out;
import static name.invikto.utils.ArrayProcessor.getArrElementSum;
import static name.invikto.utils.DataTypeConverter.convertStringArrToIntArr;

public class Main {
  public static void main(String[] args) {
    out.println(getArrElementSum(convertStringArrToIntArr(args)));
  }
}
