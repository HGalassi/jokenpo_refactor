package refactor.jogada;

import refactor.resultado.Empata;
import refactor.resultado.Ganha;
import refactor.resultado.Perde;
import refactor.resultado.Resultado;

public class Papel extends Jogada{

    private Resultado resultado;

    public Papel(Jogada jogada) throws Exception {
        this.resultado = result(jogada);
    }

    public Papel() throws Exception {
    }

    @Override
    protected Resultado result(Jogada jogada) throws Exception {
        if(jogada instanceof Papel){
           resultado =  new Empata();
        }else if(jogada instanceof Pedra){
            resultado =  new Ganha();
        }else if (jogada instanceof Tesoura){
            resultado =  new Perde();
        }
        if(null != resultado){
            return resultado;
        }
        throw new Exception("Q isso vei");
    }

    @Override
    protected String getInstancia() {
        return "Papel";
    }

    public Resultado getResultado() throws Exception {
        return resultado;
    }
}
