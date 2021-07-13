public class programa {
  public static void main(String[] args) {
    Conta minhaconta;
    minhaconta = new Conta();

    minhaconta.titular = "herbert";
    minhaconta.saldo = 2000.00;

    Conta segundaconta = minhaconta;

    if (minhaconta == segundaconta) {
      System.out.println("Contas iguais!");
    }
  }
}
