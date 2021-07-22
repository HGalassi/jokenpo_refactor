package refactor.exemplos.inline_function;

import org.junit.Assert;
import org.junit.Test;


/**
 * Quando fazer? Quando existem muitas delegacoes de uma funcao para outra, de tarefas simples e podem tornar a leitura do codigo dificil ou confusa.
 */

public class RatingMotoristaTest {

    @Test
    public void testRatingMotoristaInativo()  {
        RatingMotorista rating = new RatingMotorista();
        RatingMotorista.Motorista motorista = new RatingMotorista.Motorista();
        motorista.isAtivo = false;
        Assert.assertTrue(rating.getNotaMotorista(motorista) == 0);
    }

    @Test
    public void testRatingMotoristaAtivo()  {
        RatingMotorista rating = new RatingMotorista();
        RatingMotorista.Motorista motorista = new RatingMotorista.Motorista();
        motorista.isAtivo = true;
        Assert.assertTrue(rating.getNotaMotorista(motorista) == 5);
    }

    @Test
    public void testRatingMotoristaInativoRefactor()  {
        RatingMotoristaRefactor rating = new RatingMotoristaRefactor();
        RatingMotoristaRefactor.Motorista motorista = new RatingMotoristaRefactor.Motorista();
        motorista.isAtivo = false;
        Assert.assertTrue(rating.getNotaMotorista(motorista) == 0);
    }

    @Test
    public void testRatingMotoristaAtivoRefactor()  {
        RatingMotoristaRefactor rating = new RatingMotoristaRefactor();
        RatingMotoristaRefactor.Motorista motorista = new RatingMotoristaRefactor.Motorista();
        motorista.isAtivo = true;
        Assert.assertTrue(rating.getNotaMotorista(motorista) == 5);
    }
}
