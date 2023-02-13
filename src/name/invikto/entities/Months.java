package name.invikto.entities;

import org.jetbrains.annotations.Nullable;

import static name.invikto.utils.ConsoleLogger.logError;

public enum Months {
  JAN("January"),
  FEB("February"),
  MAR("March"),
  APR("April"),
  MAY("May"),
  JUN("June"),
  JUL("July"),
  AUG("August"),
  SEP("September"),
  OCT("October"),
  NOV("November"),
  DEC("December");

  private final String month;

  Months(String month) {
    this.month = month;
  }

  public String getMonth() {
    return month;
  }

  public static @Nullable String getMonthByIndex(int index) {
    try {
      return Months.values()[index - 1].getMonth();
    } catch (ArrayIndexOutOfBoundsException error) {
      logError(error);
    }
    return null;
  }
}
