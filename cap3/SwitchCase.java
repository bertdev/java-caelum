public class SwitchCase {
  public static void main(String[] args) {
    int idade = 18;

    switch (idade) {
      case 18:
        System.out.println("Você tem que se alistar");
        break;
      case 17: 
        System.out.println("Falta 1 ano para você se alistar");
        break;
      default:
        break;
    }
  }
}
