public class Conta {
  private int identificador;
  private Cliente titular;
  private double saldo;
  private double salario;
  private double limite;
  private static int totalContas;

// constructors
  Conta(String nomeTitular) {
    this.titular = new Cliente(nomeTitular);
    Conta.totalContas = Conta.totalContas + 1;
    this.identificador = Conta.totalContas;
  }

  Conta() {
    Conta.totalContas = Conta.totalContas + 1;
    this.identificador = Conta.totalContas;
  }



  public boolean saca(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    } else {
      return false;
    }
  }

  public void deposita(double valor) {
    if (valor > 0) {
      this.saldo += valor;
    }
  }

  public boolean transferePara(Conta destino, double valor) {
    boolean retirou = this.saca(valor);
    if (retirou) {
      destino.deposita(valor);
      return true;
    } else {
      return false;
    }
  }

// getters & setters

  public double getSaldo() {
    return this.saldo + this.limite;
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public static int getTotalDeContas() {
    return Conta.totalContas;
  }

  public double getRendimento() {
    return this.saldo * 0.1;
  }

  public int getIdentificador() {
    return this.identificador;
  }

}
