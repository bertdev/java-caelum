public class ex4 {
  public static void main(String[] args) {
    int fatorial = 1;
    for (int n = 1; n <= 10; n++) {
      System.out.print("O fatorial de "+ n +": ");
      if (n == 1) {
        System.out.println(1);
        continue;
      }
      for (int i = n; i > 0; i--) {
        fatorial *= i;
      }
      System.out.println(fatorial);
      fatorial = 1;
    }
  }
}