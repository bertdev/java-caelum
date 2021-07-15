public class Conta {
  int numero;
  Cliente titular;
  double saldo;
  double salario;


  boolean saca(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    } else {
      return false;
    }
  }

  void deposita(double valor) {
    this.saldo += valor;
  }

  boolean transferePara(Conta destino, double valor) {
    boolean retirou = this.saca(valor);
    if (retirou) {
      destino.deposita(valor);
      return true;
    } else {
      return false;
    }
  }

}