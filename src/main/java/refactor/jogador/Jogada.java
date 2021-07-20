package refactor.jogador;

public class Jogada {

    private String jogada1;
    private String jogada2;

    public void setJogada1(String jogada1) {
        this.jogada1 =  jogada1;
    }

    public void setJogada2(String jogada2) {
        this.jogada2 = jogada2;
    }

    public String getVencedor() throws Exception {

        if(jogada1.equals("pedra") && jogada2.equals("papel")){
            return "JOGADOR_2";
        }else if(jogada1.equals("pedra") && jogada2.equals("pedra")){
            return "EMPATE";
        }else if(jogada1.equals("pedra") && jogada2.equals("tesoura")){
            return "JOGADOR_1";
        }else if(jogada1.equals("papel") && jogada2.equals("pedra")){
            return "JOGADOR_1";
        }else if(jogada1.equals("tesoura") && jogada2.equals("pedra")){
            return "JOGADOR_2";
        }else if(jogada1.equals("papel") && jogada2.equals("papel")){
            return "EMPATE";
        }else if(jogada1.equals("papel") && jogada2.equals("tesoura")){
            return "JOGADOR_2";
        }else if(jogada1.equals("tesoura") && jogada2.equals("tesoura")){
            return "EMPATE";
        }

        /**
         * Exception quando tipo de jogada invalido
         */
        throw new Exception("Q isso vei");
    }
}
