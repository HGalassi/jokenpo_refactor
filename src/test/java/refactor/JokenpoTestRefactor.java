package refactor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import refactor.jogada.Jogada;
import refactor.jogada.Papel;
import refactor.jogada.Pedra;
import refactor.jogada.Tesoura;
import refactor.resultado.Empata;
import refactor.resultado.Ganha;
import refactor.resultado.Perde;

public class JokenpoTestRefactor {

    @Test
    public void quandoPapel_e_papel_Empate() throws Exception {
        Papel papel = new Papel(Jogada.getInstance("Papel"));
        Assertions.assertTrue(papel.getResultado() instanceof Empata);
    }

    @Test
    public void quandoPapel_e_tesoura_Empate() throws Exception {
        Papel papel = new Papel(Jogada.getInstance("Tesoura"));
        Assertions.assertTrue(papel.getResultado() instanceof Perde);
    }

    @Test
    public void quandoPapel_e_Pedra_Ganha() throws Exception {
        Papel papel = new Papel(Jogada.getInstance("Pedra"));
        Assertions.assertTrue(papel.getResultado() instanceof Ganha);
    }

    @Test
    public void quandoPedra_e_Pedra_Empate() throws Exception {
        Pedra pedra = new Pedra(Jogada.getInstance("Pedra"));
        Assertions.assertTrue(pedra.getResultado() instanceof Empata);
    }

    @Test
    public void quandoPedra_e_tesoura_Papel_Perde() throws Exception {
        Pedra pedra = new Pedra(Jogada.getInstance("Papel"));
        Assertions.assertTrue(pedra.getResultado() instanceof Perde);
    }

    @Test
    public void quandoPedra_e_Tesoura_Ganha() throws Exception {
        Pedra pedra = new Pedra(Jogada.getInstance("Tesoura"));
        Assertions.assertTrue(pedra.getResultado() instanceof Ganha);
    }


    @Test
    public void quandoTesoura_e_papel_Tesoura() throws Exception {
        Tesoura tesoura = new Tesoura(Jogada.getInstance("Tesoura"));
        Assertions.assertTrue(tesoura.getResultado() instanceof Empata);
    }

    @Test
    public void quandoTesoura_e_pedra_Empate() throws Exception {
        Tesoura tesoura = new Tesoura(Jogada.getInstance("Pedra"));
        Assertions.assertTrue(tesoura.getResultado() instanceof Perde);
    }

    @Test
    public void quandoTesoura_e_Papel_Ganha() throws Exception {
        Tesoura tesoura = new Tesoura(Jogada.getInstance("Papel"));
        Assertions.assertTrue(tesoura.getResultado() instanceof Ganha);
    }
}
