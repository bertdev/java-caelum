public class LabeledLoops {
  public static void main(String[] args) {
    //usado para nomear loops aninhados para poder facilitar o uso de break e continue
    //nesses casos de loops aninhados 

    Other: 
      for(int i = 0; i < 10; i++) {
        System.out.println(i);
        for (int j = 0; i < 5; j++) {
          System.out.println(j);
          if(j == 2) {
            break Other;
          }
        }
      }
  }
}