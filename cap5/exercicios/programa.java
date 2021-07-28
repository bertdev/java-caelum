public class programa {
  public static void main(String[] args) {
    Conta minhaconta = new Conta("Herbert");
    minhaconta.deposita(1000);

    System.out.println("Saldo: " + minhaconta.getSaldo());
    System.out.println("Nome do titular: " + minhaconta.getTitular().getNome());
    System.out.println("Rendimento mensal da conta: R$" + minhaconta.getRendimento());
    System.out.println("Identificador da conta: " + minhaconta.getIdentificador());
    System.out.println("Total de contas: " + Conta.getTotalDeContas());
  }
}
