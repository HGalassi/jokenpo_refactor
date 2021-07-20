package refactor.jogada;

import refactor.resultado.Resultado;

public abstract class Jogada {

    protected abstract Resultado result(Jogada jogada) throws Exception;

    public Resultado getResultado(Jogada jogada) throws Exception {
        return this.result(jogada);
    }

    public static Jogada getInstance(String stringOf) throws Exception {
        switch (stringOf){
            case "Papel" :
                return new Papel();
            case "Pedra" :
                return new Pedra();
            case "Tesoura" :
                return new Tesoura();
        }
        throw new Exception("Invalid type");
    }

    protected abstract String getInstancia();

    @Override
    public String toString() {
        return "Jogada=" + this.getInstancia();
    }
}
