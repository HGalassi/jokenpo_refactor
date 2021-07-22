package refactor.exemplos.inline_function;


/**
 *
 */
public class RatingMotorista {

    public static class Motorista {
        public boolean isAtivo;
    }

    public int getNotaMotorista(Motorista motorista) {
        return isMotoristaAtivo(motorista) ? 5 : 0;
    }

    private boolean isMotoristaAtivo(Motorista motorista) {
        return motorista.isAtivo;
    }
}
