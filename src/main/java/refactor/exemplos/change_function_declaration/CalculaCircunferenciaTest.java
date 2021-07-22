package refactor.exemplos.change_function_declaration;

import org.junit.Assert;
import org.junit.Test;

public class CalculaCircunferenciaTest {

    @Test
    public void testaCalculaCircunferencia(){
        CalculaCircunferencia calc = new CalculaCircunferencia();
        Assert.assertTrue(calc.circunferencia(5.21) == 32.73539545040565);
        System.out.println(calc.circun(5.21));
    }

    @Test
    public void testaCalculaCircunferenciaRefactor(){
        CalculaCircunferencia calc = new CalculaCircunferencia();
        Assert.assertTrue(calc.circunferencia(5.21) == 32.73539545040565);
        System.out.println(calc.circunferencia(5.21));
    }
}
