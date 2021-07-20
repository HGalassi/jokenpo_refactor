package refactor.resultado;

public abstract class Resultado {

    protected abstract String getInstance();

    @Override
    public String toString() {
        return "Resultado=" + this.getInstance();
    }
}
