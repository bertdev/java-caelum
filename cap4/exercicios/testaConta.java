public class testaConta {
  public static void main(String[] args) {
    Conta minhaConta = new Conta();
    minhaConta.titular = new Cliente();
    minhaConta.titular.nome = "Herbert";
    minhaConta.titular.idade = 20;
    minhaConta.saldo = 3000;

    minhaConta.saca(500);
    minhaConta.deposita(33);

    double rendimentos = minhaConta.calculaRendimento();
    String dados = minhaConta.recuperaDadosParaImpressao();

    System.out.println("Os rendimentos dessa conta são: " + rendimentos);
    System.out.println(dados);
  }  
}
