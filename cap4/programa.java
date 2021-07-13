public class programa {
  public static void main(String[] args) {
    Conta minhaconta = new Conta();
    minhaconta.titular = new Cliente();
    minhaconta.titular.nome = "Herbert";
    minhaconta.saldo = 2000.00;

    Conta segundaconta = new Conta();
    segundaconta.titular = new Cliente();
    segundaconta.titular.nome = "henrique";
    segundaconta.saldo = 200.00;

    minhaconta.transferePara(segundaconta, 300);

    System.out.println("Saldo atual segunda conta: " + segundaconta.saldo);

    System.out.println("Titular da conta que transferiu: " + minhaconta.titular.nome);
  
  }
}
