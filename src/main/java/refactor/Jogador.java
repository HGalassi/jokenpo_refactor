package refactor;

import refactor.jogada.Jogada;
import refactor.resultado.Resultado;

public class Jogador {

    private String nickName;

    private Jogada jogada;

    private Resultado resultado;

    public Jogador(Jogada jogada, String nickName){
        this.jogada = jogada;
        this.nickName = nickName;
    }

    public Jogada getJogada() {
        return jogada;
    }

    public void setResultado(Resultado resultado){
        this.resultado = resultado;
    }

    public Resultado getResultado(){
        return resultado;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nickName='" + nickName + '\'' + " " +
                 jogada + " " +
                 resultado +
                '}';
    }
}
