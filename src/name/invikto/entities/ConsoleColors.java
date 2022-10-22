package name.invikto.entities;

public enum ConsoleColors {
  DEFAULT("\u001B[0m"),
  RED("\u001B[31m");

  private final String codeSequence;

  ConsoleColors(String codeSequence) {
    this.codeSequence = codeSequence;
  }

  public String getCodeSequence() {
    return codeSequence;
  }
}
