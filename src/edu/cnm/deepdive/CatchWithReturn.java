package edu.cnm.deepdive;

public class CatchWithReturn {

  public static void main(String[] args) {
    System.out.println(calculate());
  }

  public static int calculate() {
    try {
      return 10 / 0;
    } catch (ArithmeticException e) {
      System.out.println("error");
//      System.exit(0); terminates the application so only 'error' would be printed.
      return 1;//although it returns 1 here, the finally block gets always executed and will return
      //0 instead. Prints: error - finally - 0
    } finally {
      System.out.println("finally");
      return 0;
    }
  }

}
