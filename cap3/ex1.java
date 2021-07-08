class ex1 {
  public static void main(String[] args) {
//Na empresa onde trabalhamos, há tabelas com o quanto foi gasto em cada mês. Para fechar o
//balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram
//gastos 15000 reais, em Fevereiro, 23000 reais e em Março, 17000 reais, faça um programa que
//calcule e imprima o gasto total no trimestre e a média mensal de gastos.
    int janeiro = 15000;
    int feveriro = 23000;
    int marco = 17000;

    int gastoTotal = janeiro + feveriro + marco;
    System.out.println("Gasto total: " + gastoTotal + " reais");

    double mediaMensal = gastoTotal / 3;
    System.out.println("Média mensal de gastos: " + mediaMensal + " reais");

  }
}