package entities;

public class MeioCampo implements PosicaoTatica {

  private String nomeJogador;


  public MeioCampo(String nomeJogador) {
    this.nomeJogador = nomeJogador;
  }

  @Override
  public void descreverResponsabilidade() {
    System.out.println("Posição: Meio-Campista (" + nomeJogador + ")");
    System.out.println("Responsabilidade: Controlar o ritmo do jogo, distribuir passes e conectar a defesa ao ataque.");
  }

  @Override
  public void executarInstrucaoTatica() {
    System.out.println("AÇÃO: " + nomeJogador + " está lançando uma bola em profundidade para o atacante.");
  }
}