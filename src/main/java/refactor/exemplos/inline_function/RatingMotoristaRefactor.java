package refactor.exemplos.inline_function;

/**
 * Quando o corpo da funcao for tao claro quanto o nome, voce pode eliminar a funcao.
 * Isso ajuda a controlar as cadeias de metodos delegando funcoes muito pequenas a outros metodos.
 */
public class RatingMotoristaRefactor {

    public static class Motorista {
        public boolean isAtivo;
    }

    public int getNotaMotorista(Motorista motorista) {
        return (motorista.isAtivo) ? 5 : 0;
    }
}
