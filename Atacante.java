package entities;

public class Atacante implements PosicaoTatica {
  private String nomeJogador;

  public Atacante(String nomeJogador) {
    this.nomeJogador = nomeJogador;
  }

  @Override
  public void descreverResponsabilidade() {
    System.out.println("Posição: Atacante (" +nomeJogador + ")");
    System.out.println("Responsabilidade: Marcar gols, pressionar a defesa adversária e criar chances de ataque\n");
  }
  @Override
  public void executarInstrucaoTatica() {
    System.out.println("AÇÃO: " + nomeJogador + "está se infiltrando na defesa adversária para receber o passe");
  }
}

