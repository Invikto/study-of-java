package name.invikto.tasks.task2;

import java.util.Arrays;

import static java.lang.System.out;
import static java.util.Collections.reverse;

public class Main {
  public static void main(String[] args) {
    reverse(Arrays.asList(args));
    out.println(Arrays.toString(args));
  }
}
