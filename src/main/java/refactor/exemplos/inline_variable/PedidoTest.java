package refactor.exemplos.inline_variable;

import org.junit.Assert;
import org.junit.Test;



public class PedidoTest {

    @Test
    public void tetstBiggerThan(){
        Pedido pedido = new Pedido();
        Assert.assertTrue(pedido.precoBase(200));
    }

    @Test
    public void tetstBiggerThanDeveRetornarFalse(){
        Pedido pedido = new Pedido();
        Assert.assertFalse(pedido.precoBaseRefactor(50));
    }
}
