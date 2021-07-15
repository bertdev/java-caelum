public class Carro {
  String cor;
  String modelo;
  double velocidadeAtual = 0;
  double velocidadeMaxima;
  Motor motor = new Motor();

  void liga() {
    System.out.println("O carro está ligado!");
  }

  void acelera(double quantidade) {
    this.velocidadeAtual += quantidade;
  }

  // devolve a marcha do carro 
  int pegaMarcha() {
    if (this.velocidadeAtual < 0) {
      return 0;
    } else if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
      return 1;
    } else if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
      return 2;
    } else {
      return 3;
    }
  }
}