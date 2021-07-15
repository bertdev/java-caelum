public class Conta {
  Cliente titular = new Cliente();
  String agencia;
  String dataAbertura;
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
    return "Nome: " + this.titular.nome + "\nIdade: " + this.titular.idade + 
    "\nSaldo: " + this.saldo;
  }

}
