package refactor;

import refactor.jogada.Jogada;

public class Campeonato {

    private Jogador ganhador;

    public Campeonato(Jogador jogador1, Jogador jogador2){
        jogador1.getJogada();
        jogador2.getJogada();
     }

    public Jogador getGanhador() {
        return ganhador;
    }
}
