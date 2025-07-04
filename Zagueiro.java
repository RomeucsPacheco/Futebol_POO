package entities;

public class Zagueiro implements PosicaoTatica {
  private String nomeJogador;

  public Zagueiro(String nomeJogador) {
    this.nomeJogador = nomeJogador;
  }
  @Override
  public void descreverResponsabilidade() {
    System.out.println("Posição: Zagueiro (" + nomeJogador + ")");
    System.out.println("Responsabilidade: Proteger a área, marcar os atacantes adversários e afastar o perigo.");
  }


  @Override
  public void executarInstrucaoTatica() {
    System.out.println("AÇÃO: " + nomeJogador + " está fazendo um corte preciso para interceptar o passe!");
  }
}