public class IfEElse {
  public static void main(String[] args) {
    //operações booleanas são aquelas que retornam um valor booleano como resultado
    //usamos operadores relacioanais para isso 
    // >, <, >=, <=
    //operador de comparação -> ==

    int idade = 20;

    // if(idade > 18) {
    //   System.out.println("Você pode entrar!");
    // } else {
    //   System.out.println("Você não tem idade suficiente para entrar!");
    // }

    //podemos concatenar espressões booleanas atráves dos operadores lógicos
    //E -> && , OU -> ||

    boolean amigoDoDono = false;

    if(idade > 18 || amigoDoDono) {
      System.out.println("Você pode entrar");
    } else {
      System.out.println("Você não tem idade suficiente para entrar");
    }

  }
}
