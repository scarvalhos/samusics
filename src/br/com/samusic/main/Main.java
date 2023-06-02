package br.com.samusic.main;

import br.com.samusics.models.Favorites;
import br.com.samusics.models.Podcast;
import br.com.samusics.models.Music;

public class Main {
    public static void main(String[] args) {
        Music music = new Music();
        music.setTitle("Vem me buscar");
        music.setSinger("Jeferson e Suellen");

        for (int i = 0; i < 1000; i++) {
            music.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            music.like();
        }

        Podcast podcast = new Podcast();
        podcast.setTitle("Jesuscopy podcast");
        podcast.setPresenter("Douglas Gonçalves");

        for (int i = 0; i < 3000; i++) {
            podcast.reproduce();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.like();
        }

        Favorites favorites = new Favorites();
        favorites.include(podcast);
        favorites.include(music);
    }
}
