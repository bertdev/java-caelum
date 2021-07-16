public class Casa {
  String cor;
  Porta porta1 = new Porta(), porta2 = new Porta(), porta3 = new Porta();

  void pinta(String Novacor) {
    this.cor = Novacor;
  }

  int quantasPortasEstaoAbertas() {
    int quantidadePortasAbertas = 0;
    if (porta1.aberta) {
      quantidadePortasAbertas++;
    }
    if (porta2.aberta) {
      quantidadePortasAbertas++;
    }
    if (porta3.aberta) {
      quantidadePortasAbertas++;
    }

    return quantidadePortasAbertas;
  }
}