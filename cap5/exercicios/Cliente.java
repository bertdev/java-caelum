public class Cliente {
  private String nome;
  private String sobrenome;
  private String cpf;
  private int idade;

// constructor
  Cliente(String nome) {
    this.nome = nome;
  }

  public void mudaCpf(String cpf) {
    this.cpf = cpf;
  }

// getters & setters

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }


}
