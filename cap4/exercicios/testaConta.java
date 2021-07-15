public class testaConta {
  public static void main(String[] args) {
    Conta c1 = new Conta();
    c1.titular.nome = "Danilo";
    c1.saldo = 2000;
    Conta c2 = new Conta();
    c1.titular.nome = "Danilo";
    c1.saldo = 2000;

    if (c1 == c2) {
      System.out.println("São identicas!!");
    } else {
      System.out.println("São diferentes!!");
    }

    c1.titular.nome = "Hugo";
    c2 = c1;

    if (c1 == c2) {
      System.out.println("Agora são iguais!!");
    } else {
      System.out.println("Ainda são diferentes!!");
    }
  }  
}
