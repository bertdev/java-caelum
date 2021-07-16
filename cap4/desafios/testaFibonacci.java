public class testaFibonacci {
  public static void main(String[] args) {
    Fibonacci fibonacci = new Fibonacci();
    
    for (int i = 0; i <= 6; i++) {
      int resultado = fibonacci.calculaFibonacci(i);
      System.out.println(resultado);
    }
  }
}