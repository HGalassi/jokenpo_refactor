package refactor.jogada;

import refactor.resultado.Empata;
import refactor.resultado.Ganha;
import refactor.resultado.Perde;
import refactor.resultado.Resultado;

public class Tesoura extends Jogada {

    public Tesoura(){}

    private Resultado resultado;

    public Tesoura(Jogada jogada) throws Exception {
        this.resultado = result(jogada);
    }

    @Override
    protected Resultado result(Jogada jogada) throws Exception {
        if(jogada instanceof Papel){
            return new Ganha();
        }else if(jogada instanceof Pedra){
            return new Perde();
        }else if (jogada instanceof Tesoura){
            return new Empata();
        }
        throw new Exception("Invalid Type");
    }

    @Override
    protected String getInstancia() { return "Tesoura"; }

    public Resultado getResultado() {
        return resultado;
    }
}
