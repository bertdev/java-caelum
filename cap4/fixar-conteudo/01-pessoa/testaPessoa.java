public class testaPessoa {
  public static void main(String[] args) {
    Pessoa eu = new Pessoa(); 
    eu.nome = "Herbert";
    eu.idade = 20;
  
    eu.fazAniversario();
    eu.fazAniversario();
    System.out.println("Nome: " + eu.nome + "\nIdade: " + eu.idade);
  }
}
