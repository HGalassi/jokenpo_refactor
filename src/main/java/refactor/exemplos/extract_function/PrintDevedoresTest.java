package refactor.exemplos.extract_function;

import org.junit.Test;

public class PrintDevedoresTest {

    @Test
    public void printaDevedoresTest(){
        PrintDevedores print = new PrintDevedores();
        print.printaDevedores();
    }

    @Test
    public void printaDevedoresRefactorTest(){
        PrintDevedoresRefactor print = new PrintDevedoresRefactor();
        print.printaDevedores();
    }
}
