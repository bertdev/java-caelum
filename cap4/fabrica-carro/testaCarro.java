import javax.swing.plaf.synth.SynthLookAndFeel;

public class testaCarro {
  public static void main(String[] args) {
    Carro meucarro = new Carro();
    meucarro.cor = "Verde";
    meucarro.modelo = "Fusca";
    meucarro.velocidadeAtual = 0;
    meucarro.velocidadeMaxima = 80;
    meucarro.motor.potencia = 200;

    meucarro.liga();

    meucarro.acelera(20);
    System.out.println("A velocidade atual é: " + meucarro.velocidadeAtual);
    System.out.println("O seu motor possui " + meucarro.motor.potencia + " cavalos de potencia");
  }
}
