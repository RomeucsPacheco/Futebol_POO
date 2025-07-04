# Documentação do Projeto: Simulação de Time de Futebol  
**Versão:** 1.0  
**Data:** 13 de junho de 2025  
**Autores:** Henrique José De Souza Nogueira e Romeu Pacheco

---

## 1. Visão Geral

Este projeto é uma simulação simples em Java que modela as diferentes posições táticas de um time de futebol. O objetivo principal é demonstrar os conceitos fundamentais de Programação Orientada a Objetos (POO), como **Interfaces** e **Polimorfismo**, de uma maneira prática e fácil de entender.

O programa define um "contrato" comum para todas as posições táticas e, em seguida, cria classes específicas para cada posição (Goleiro, Zagueiro, Atacante, etc.). Por fim, uma classe principal monta uma formação tática e exibe as responsabilidades e ações de cada jogador.

---

## 2. Estrutura do Projeto

O código está organizado em um pacote principal e uma classe de execução, conforme a estrutura abaixo:

```
.
├── entities/        // Pacote para as "entidades" do nosso sistema
│   ├── PosicaoTatica.java
│   ├── Goleiro.java
│   ├── Zagueiro.java
│   ├── Lateral.java
│   ├── MeioCampo.java
│   ├── Ponta.java
│   └── Atacante.java
└── Main.java        // Classe principal para executar o programa
```

- **entities**: Este pacote agrupa todas as classes que representam os conceitos centrais do nosso "domínio" (o mundo do futebol), ou seja, as posições em campo.  
- **Main.java**: Esta é a classe que contém o método `main`, o ponto de entrada do programa. É responsável por criar e orquestrar os objetos.

---

## 3. Componentes Principais

### 3.1. A Interface `PosicaoTatica`

Este é o componente mais importante do projeto. É o "molde" ou o "contrato" que todas as classes de posição devem seguir.

**Arquivo:** `entities/PosicaoTatica.java`

```java
public interface PosicaoTatica {
    void descreverResponsabilidade();
    void executarInstrucaoTatica();
}
```

**Propósito:** Garantir que qualquer classe que represente uma posição em campo tenha, obrigatoriamente, os mesmos métodos básicos.

**Métodos:**
- `descreverResponsabilidade()`: Deve explicar o que um jogador naquela posição faz.
- `executarInstrucaoTatica()`: Simula uma ação específica daquela posição durante o jogo.

---

### 3.2. As Classes de Posição

Cada classe de posição (Goleiro, Zagueiro, Atacante, etc.) representa uma função específica no time. Todas elas compartilham a mesma estrutura básica.

**Exemplo - Estrutura da Classe `Zagueiro.java`:**

```java
package entities;

public class Zagueiro implements PosicaoTatica {
    private String nomeJogador;

    public Zagueiro(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    @Override
    public void descreverResponsabilidade() {
        System.out.println("Posição: Zagueiro (" + nomeJogador + ")");
        // ... texto da responsabilidade
    }

    @Override
    public void executarInstrucaoTatica() {
        System.out.println("AÇÃO: " + nomeJogador + " está fazendo um corte...");
        // ... texto da ação
    }
}
```

**Análise da Estrutura:**

1. `implements PosicaoTatica`: Conecta a classe à interface.
2. Atributo `nomeJogador`: Identifica quem está naquela posição.
3. Construtor: Inicializa o objeto com nome.
4. Métodos com `@Override`: Implementam a lógica específica da posição.

---

### 3.3. A Classe Principal `Main`

Esta classe é responsável por dar vida à simulação.

**Arquivo:** `Main.java`

```java
import java.util.List;
import java.util.ArrayList;
import entities.*;

public class Main {
    public static void main(String[] args) {
        List<PosicaoTatica> formacaoTatica = new ArrayList<>();

        formacaoTatica.add(new Goleiro("Alisson"));
        formacaoTatica.add(new Zagueiro("Marquinhos"));
        // ... outros jogadores

        for(PosicaoTatica posicao : formacaoTatica) {
            posicao.descreverResponsabilidade();
            posicao.executarInstrucaoTatica();
            System.out.println("----------------------------------------------");
        }
    }
}
```

**Análise da Execução (Polimorfismo):**

1. **Lista Genérica:** `List<PosicaoTatica>` aceita qualquer objeto que implemente a interface.
2. **Adição de Jogadores:** Objetos de diferentes classes são adicionados à mesma lista.
3. **Laço `for`:** O método correto é chamado conforme o tipo real do objeto.

> Esse comportamento é o **polimorfismo**, que permite tratar objetos diferentes de forma uniforme com base em uma interface comum.

---

## 4. Como Compilar e Executar

**Pré-requisitos:** Ter o JDK (Java Development Kit) instalado e configurado.

**Compilação:**
```bash
javac entities/*.java Main.java
```

**Execução:**
```bash
java Main
```

A saída do programa com o plano de jogo será exibida no terminal.

---

## 5. Conclusão

Este projeto, embora simples, implementa um design de software robusto e limpo. A separação de responsabilidades através da interface `PosicaoTatica` e das classes concretas permite que o sistema seja facilmente expandido e mantido, além de servir como um excelente exemplo prático dos pilares da Programação Orientada a Objetos.
