class CastingEPromocao {
  public static void main(String[] args) {
    //uma variavel do tipo doble não pode ser atribuida diretamente em um int
    //pois o compilador não consegue garantir que não ocorram perda de valores 
    //nessa conversão, entretando, uma variavel do tipo int pode ser atribuida
    //diretamente a uma do tipo double 

    /* os exemplos darão erro de compilação
    double x = 5;
    int z = x; 
    ou 
    double a = 3.4;
    int d = a;
    */

    int i = 15;
    double j = i;
    System.out.println(j);

    //quando precisamos arredondar um numero quebrado e armazenado em um int
    //esse processo recebe o nome de casting
    double pi = 3.14;
    int x = (int) pi;
    System.out.println(x);

    //o mesmo acontece com o tipo long(não permite atribuiçãos em casting)
    long z = 100000;
    int v = (int) z;
    System.out.println(v);

  }
}
