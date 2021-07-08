public class ControlandoLoops {
  public static void main(String[] args) {
    //as vezes podemos quere controlar um loop usando os comandos break e continue 
    //break irá fazer o loop parar
    //continue irá fazer o loop seguir para a proxima execução

    for (int i = 0; i < 50; i++) {
      if (i % 19 == 0) {
        System.out.println("Encontrei um número divisivel por 19 entre 0 e 50");
        break;
      }
    }

    for (int i = 0; i < 100; i++) {
      if (i > 50 && i < 60) {
        System.out.println(i);
        continue;
      }
    } 
  }
}