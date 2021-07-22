package refactor.exemplos.inline_variable;

/**
 * Se a expressao for tao clara quanto um nome de variavel.. elimine a variavel
 */
public class Pedido {

    public boolean precoBase(double precoBase){
        var isBiggerThan = precoBase > 100;
        return isBiggerThan;
    }

    public boolean precoBaseRefactor(double precoBase){
        return precoBase > 100;
    }
}
