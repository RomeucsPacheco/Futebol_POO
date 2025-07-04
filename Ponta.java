package entities;


public class Ponta implements PosicaoTatica {

  private String nomeJogador;

  public Ponta(String nomeJogador) {
    this.nomeJogador = nomeJogador;
  }


  @Override
  public void descreverResponsabilidade() {
    System.out.println("Posição: Ponta (" + nomeJogador + ")");
    System.out.println("Responsabilidade: Usar a velocidade para driblar os defensores, fazer cruzamentos e finalizar para o gol.");
  }

  @Override
  public void executarInstrucaoTatica() {
    System.out.println("AÇÃO: " + nomeJogador + " está driblando o adversário na linha de fundo e preparando o cruzamento.");
  }
}