package br.com.alura.minhasmusicas.principal;
import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica batidao = new Musica();
        batidao.setTitulo("Salta o Batidão");
        batidao.setCantor("MC do Sertanejo");

        for (int i = 0; i < 1000; i++) {
            batidao.reproduzir();
        }

        for (int i = 0; i < 50; i++){
            batidao.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 10000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(batidao);
        preferidas.inclui(meuPodcast);
    }
}

