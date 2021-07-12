public class Conta {
  int numero;
  String titular;
  double saldo;
  double salario;

  void saca(double quantidade) {
    double novosaldo = this.saldo - quantidade;
    this.saldo = novosaldo;
  }

  void deposita(double quantidade) {
    this.saldo += quantidade;
  }

}