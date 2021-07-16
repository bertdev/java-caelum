public class Porta {
  boolean aberta;
  String cor;
  double dimensaoX;
  double dimensaoY;
  double dimensaoZ;

  void abre() {
    if (this.aberta == false) {
      this.aberta = true;
    }
  }

  void fecha() {
    if (this.aberta == true) {
      this.aberta = false;
    }
  }

  void pinta(String novaCor) {
    this.cor = novaCor;
  }

  boolean estaAberta() {
    return this.aberta;
  }
}