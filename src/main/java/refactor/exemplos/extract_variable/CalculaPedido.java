package refactor.exemplos.extract_variable;

public class CalculaPedido {

    public static class Pedido{
        int quantidade = 0;
        double preco = 0.0;
    }

    public Double calculaPedido(Pedido pedido){
        return pedido.quantidade * pedido.preco - Math.max(0, pedido.quantidade - 500) * pedido.preco
                 * 0.05 + Math.min(pedido.quantidade * pedido.preco * 0.1,100);
    }
}
