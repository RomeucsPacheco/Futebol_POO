package entities;


public class Lateral implements PosicaoTatica {

  private String nomeJogador;

  public Lateral(String nomeJogador) {
    this.nomeJogador = nomeJogador;
  }

  @Override
  public void descreverResponsabilidade() {
    System.out.println("Posição: Lateral (" + nomeJogador + ")");
    System.out.println("Responsabilidade: Defender os lados do campo e apoiar o ataque com cruzamentos.");
  }

  @Override
  public void executarInstrucaoTatica() {
    System.out.println("AÇÃO: " + nomeJogador + " está avançando pela lateral para cruzar a bola na área.");
  }
}