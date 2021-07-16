public class testaCasa {
  public static void main(String[] args) {
    Casa minhaCasa = new Casa();
    
    minhaCasa.porta1.pinta("marrom");
    minhaCasa.porta2.pinta("marrom");
    minhaCasa.porta2.pinta("preta");

    minhaCasa.porta1.abre();
    minhaCasa.porta2.fecha();
    minhaCasa.porta3.abre();

    minhaCasa.pinta("laranja");

    int portasAbertas = minhaCasa.quantasPortasEstaoAbertas();
    System.out.println(portasAbertas);
  }
}