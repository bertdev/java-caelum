public class Conta {
  int numero;
  String titular;
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

  void deposita(double quantidade) {
    this.saldo += quantidade;
  }

}