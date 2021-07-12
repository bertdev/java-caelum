public class programa {
  public static void main(String[] args) {
    Conta minhaconta;
    minhaconta = new Conta();

    minhaconta.titular = "herbert";
    minhaconta.saldo = 2000.00;

    System.out.println("Saldo atual: " + minhaconta.saldo);
    minhaconta.saca(300);
    minhaconta.deposita(500);
    System.out.println("Saldo atual: " + minhaconta.saldo);
  }
}
