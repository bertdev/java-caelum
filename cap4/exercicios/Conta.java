public class Conta {
  Cliente titular = new Cliente();
  String agencia;
  Data dataAbertura = new Data();
  int numero;
  double saldo;

  void saca(double valor) {
    this.saldo -= valor;
  }

  void deposita(double valor) {
    this.saldo += valor;
  }

  double calculaRendimento() {
    return this.saldo * 0.1;
  }

  String recuperaDadosParaImpressao() {
    String dados = "Nome: " + this.titular.nome;
    dados += "\nIdade: " + this.titular.idade;
    dados += "\nSaldo: " + this.saldo;
    dados += "\nData de abertura: " + this.dataAbertura.formatada();
    return dados;
  }

}
