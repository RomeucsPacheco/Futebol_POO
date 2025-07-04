package entities;

public class Goleiro implements PosicaoTatica {

  private String nomeJogador;

  public Goleiro(String nomeJogador) {
    this.nomeJogador = nomeJogador;
  }

  @Override
  public void descreverResponsabilidade() {
    System.out.println("Posição: Goleiro (" +nomeJogador + ")");
    System.out.println("Responsabilidade: Defender o gol, evitar que a bola entre no gol");
  }
  @Override
  public void executarInstrucaoTatica() {
    System.out.println("AÇÃO: " + nomeJogador + "está organizando a barreira e se posicionando para a cobrança de falta");
  }
}