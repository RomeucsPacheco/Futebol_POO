import java.util.List;
import java.util.ArrayList;

// Importando todas as classes de posição do pacote 'entities'
import entities.PosicaoTatica;
import entities.Goleiro;
import entities.Zagueiro;
import entities.Lateral;
import entities.MeioCampo;
import entities.Ponta;
import entities.Atacante;


public class Main {

  public static void main(String[] args) {


    List<PosicaoTatica> formacaoTatica = new ArrayList<>();

    // --- Montando o Time ---
    // Adicionamos um jogador para cada uma das posições que criamos.
    formacaoTatica.add(new Goleiro("Alisson"));
    formacaoTatica.add(new Zagueiro("Marquinhos"));
    formacaoTatica.add(new Lateral("Danilo"));
    formacaoTatica.add(new MeioCampo("Paquetá"));
    formacaoTatica.add(new Ponta("Rodrygo"));
    formacaoTatica.add(new Atacante("Richarlison"));


    System.out.println("--- PLANO DE JOGO E INSTRUÇÕES TÁTICAS ---");
    System.out.println();

    // Este laço funciona perfeitamente, pois não importa a classe específica
    // (Goleiro, Zagueiro, etc.), todos são tratados como um "PosicaoTatica".
    for(PosicaoTatica posicao : formacaoTatica) {
      posicao.descreverResponsabilidade();
      posicao.executarInstrucaoTatica();
      System.out.println("----------------------------------------------");
    }

  }

}