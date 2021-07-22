package refactor.exemplos.extract_variable;

import org.junit.Assert;
import org.junit.Test;

public class CalculaPedidoTest {

    @Test
    public void calculaPedido(){
        CalculaPedido calc = new CalculaPedido();
        CalculaPedido.Pedido pedido = new  CalculaPedido.Pedido();
        pedido.preco = 10.00;
        pedido.quantidade = 2;
        Assert.assertTrue(calc.calculaPedido(pedido) == 22.0);
        System.out.println(calc.calculaPedido(pedido));;
    }

    @Test
    public void calculaPedidoRefactor(){
        CalculaPedidoRefactor calc = new CalculaPedidoRefactor();
        CalculaPedidoRefactor.Pedido pedido = new  CalculaPedidoRefactor.Pedido();
        pedido.preco = 10.00;
        pedido.quantidade = 2;
        Assert.assertTrue(calc.calculaPedido(pedido) == 22.0);
        System.out.println(calc.calculaPedido(pedido));;
    }
}
