package refactor.resultado;

import refactor.Jogador;
import refactor.jogada.Papel;
import refactor.jogada.Pedra;
import refactor.jogada.Tesoura;

import java.util.HashSet;
import java.util.List;

public class CalculadoraDeResultados {

    Jogador jogador1;
    Jogador jogador2;
    HashSet<Jogador> listJogador1 = new HashSet<>();
    HashSet<Jogador> listJogador2 = new HashSet<>();

    public CalculadoraDeResultados(Jogador jogador1, Jogador jogador2) throws Exception {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public CalculadoraDeResultados(HashSet<Jogador> jogador1, HashSet<Jogador> jogador2) throws Exception {
        this.listJogador1 = jogador1;
        this.listJogador2 = jogador2;
    }

    public List<Jogador> calculaResultados() throws Exception{
        jogador1.setResultado(jogador1.getJogada().getResultado(jogador2.getJogada()));
        jogador2.setResultado(jogador2.getJogada().getResultado(jogador1.getJogada()));
        return List.of(jogador1,jogador2);
    };
}
