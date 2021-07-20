package refactor.jogada;

import refactor.resultado.Empata;
import refactor.resultado.Ganha;
import refactor.resultado.Perde;
import refactor.resultado.Resultado;

public class Pedra extends Jogada {

    public Pedra(){}

    private Resultado resultado;

    public Pedra(Jogada jogada) throws Exception {
        this.resultado = result(jogada);
    }

    @Override
    protected Resultado result(Jogada jogada) throws Exception {
        if(jogada instanceof Papel){
            return new Perde();
        }else if(jogada instanceof Pedra){
            return new Empata();
        }else if (jogada instanceof Tesoura){
            return new Ganha();
        }
        throw new Exception("Invalid Type");
    }

    @Override
    protected String getInstancia() { return "Pedra";}

    public Resultado getResultado() {
        return resultado;
    }
}
