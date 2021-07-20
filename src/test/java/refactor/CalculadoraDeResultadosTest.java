package refactor;

import org.junit.jupiter.api.Test;
import refactor.jogada.Jogada;
import refactor.resultado.CalculadoraDeResultados;

import java.util.List;

public class CalculadoraDeResultadosTest {

    @Test
    public void testaCalculadoraDeResultadosGanha() throws Exception {
        Jogador jogador1 = new Jogador(Jogada.getInstance("Pedra"), "Cat");
        Jogador jogador2 = new Jogador(Jogada.getInstance("Tesoura"), "Schrödinger");
        CalculadoraDeResultados calc = new CalculadoraDeResultados(jogador1,jogador2);
        List<Jogador> jogadores = calc.calculaResultados();
        jogadores.stream().forEach(f -> {
            System.out.println(f.toString());
        });
    }

    @Test
    public void testaCalculadoraDeResultadosEmpata() throws Exception {
        Jogador jogador1 = new Jogador(Jogada.getInstance("Tesoura"), "Cat");
        Jogador jogador2 = new Jogador(Jogada.getInstance("Tesoura"), "Schrödinger");
        CalculadoraDeResultados calc = new CalculadoraDeResultados(jogador1,jogador2);
        List<Jogador> jogadores = calc.calculaResultados();
        jogadores.stream().forEach(f -> {
            System.out.println(f.toString());
        });
    }

    @Test
    public void testaCalculadoraDeResultadosPerde() throws Exception {
        Jogador jogador1 = new Jogador(Jogada.getInstance("Papel"), "Cat");
        Jogador jogador2 = new Jogador(Jogada.getInstance("Tesoura"), "Schrödinger");
        CalculadoraDeResultados calc = new CalculadoraDeResultados(jogador1,jogador2);
        List<Jogador> jogadores = calc.calculaResultados();
        jogadores.stream().forEach(f -> {
            System.out.println(f.toString());
        });
    }
}
