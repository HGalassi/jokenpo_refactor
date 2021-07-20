import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import refactor.jogador.Jogada;

import static com.googlecode.catchexception.apis.BDDCatchException.caughtException;
import static com.googlecode.catchexception.apis.BDDCatchException.when;
import static org.assertj.core.api.BDDAssertions.then;

public class JokenpoTest {

        /**
         * Testa Pedra Jogador 1
         */

        @Test
        public void quando_jogada1Pedra_jogada2Papel_pedraPerde() throws Exception {
            Jogada jogada = new Jogada();
            jogada.setJogada1("pedra");
            jogada.setJogada2("papel");
            Assertions.assertTrue(jogada.getVencedor().equals("JOGADOR_2"));
        }

        @Test
        public void quando_jogada1Pedra_jogada2Pedra_empata() throws Exception {
            Jogada jogada = new Jogada();
            jogada.setJogada1("pedra");
            jogada.setJogada2("pedra");
            Assertions.assertTrue(jogada.getVencedor().equals("EMPATE"));
        }

        @Test
        public void quando_jogada1Pedra_jogada2Tesoura_jogador1Ganha() throws Exception {
            Jogada jogada = new Jogada();
            jogada.setJogada1("pedra");
            jogada.setJogada2("tesoura");
            Assertions.assertTrue(jogada.getVencedor().equals("JOGADOR_1"));
        }

        @Test
        public void quando_Jogada_invalida_deveLancarException() throws Exception {
            Jogada jogada = new Jogada();
            jogada.setJogada1("pedra");
            jogada.setJogada2("hadouken");
            when(() -> jogada.getVencedor());
            then(caughtException()).isInstanceOf(Exception.class).hasMessage("Q isso vei");
        }

    /**
     * Testa Pedra Jogador 2
     */

    @Test
    public void quando_jogada2Pedra_jogada1Papel_pedraPerde() throws Exception {
        Jogada jogada = new Jogada();
        jogada.setJogada1("papel");
        jogada.setJogada2("pedra");
        Assertions.assertTrue(jogada.getVencedor().equals("JOGADOR_1"));
    }

    @Test
    public void quando_jogada2Pedra_jogada1Tesoura_jogador1Ganha() throws Exception {
        Jogada jogada = new Jogada();
        jogada.setJogada1("papel");
        jogada.setJogada2("papel");
        Assertions.assertTrue(jogada.getVencedor().equals("EMPATE"));
    }

    @Test
    public void quando_jogadaPapel_jogada1Papel_jogador2Ganha() throws Exception {
        Jogada jogada = new Jogada();
        jogada.setJogada1("papel");
        jogada.setJogada2("tesoura");
        Assertions.assertTrue(jogada.getVencedor().equals("JOGADOR_2"));
    }

    @Test
    public void quando_Tesoura_jogada1Tesoura_jogador2Tesoura_empata() throws Exception {
        Jogada jogada = new Jogada();
        jogada.setJogada1("tesoura");
        jogada.setJogada2("tesoura");
        Assertions.assertTrue(jogada.getVencedor().equals("EMPATE"));
    }


    /**
     * NOVA FEATURE /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     * @throws Exception
     */

//    @Test
//    public void quando_Fogo_jogada1_papel_perde() throws Exception{
//        refactor.jogador.Jogada jogada = new refactor.jogador.Jogada();
//        jogada.setJogada1("fogo");
//        jogada.setJogada2("papel");
//        Assertions.assertTrue(jogada.getVencedor().equals("JOGADOR_1"));
//    }
}
