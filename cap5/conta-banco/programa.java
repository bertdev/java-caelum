public class programa {
  public static void main(String[] args) {
    Conta minhaconta = new Conta("Herbert");
    minhaconta.deposita(1000);

    System.out.println("Saldo: " + minhaconta.getSaldo());
    System.out.println("Nome do titular: " + minhaconta.getTitular().getNome());
    System.out.println("Total de contas: " + Conta.getTotalDeContas());
  }
}
