public class testaConta {
  public static void main(String[] args) {
    Conta c1 = new Conta();
    c1.titular.nome = "Danilo";
    c1.titular.idade = 20;
    c1.saldo = 2000;
    c1.dataAbertura.dia = 16;
    c1.dataAbertura.mes = 07;
    c1.dataAbertura.ano = 2021;

    
    System.out.println(c1.recuperaDadosParaImpressao());
  }  
}
