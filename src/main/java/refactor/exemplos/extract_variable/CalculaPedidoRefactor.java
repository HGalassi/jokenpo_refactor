package refactor.exemplos.extract_variable;

/**
 * AJuda na compreensao do codigo, tambem ajudam no debug, pois podem servir como gancho para realizar uma instrucao, printar o valor da variavel etc..
 */

public class CalculaPedidoRefactor {

    public static class Pedido{
        int quantidade = 0;
        double preco = 0.0;
    }

    public Double calculaPedido(Pedido pedido){
        var precoBase = pedido.quantidade * pedido.preco;
        var descontoPorQuantidade = Math.max(0, pedido.quantidade - 500) * pedido.preco * 0.05;
        var frete = Math.min(pedido.quantidade * pedido.preco * 0.1,100);
        return precoBase - descontoPorQuantidade + frete ;
    }
}
