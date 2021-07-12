public class ex4 {
  public static void main(String[] args) {
    long fatorial = 1;
    for (int n = 1; n < 10; n++) {
      for (int i = n; i > 0; i--) {
        fatorial *= i;
      }
      System.out.println("Fat("+n+") = "+fatorial);
    }
  }
}