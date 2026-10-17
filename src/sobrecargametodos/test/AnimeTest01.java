package sobrecargametodos.test;

import sobrecargametodos.modeo.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Rua 19","Ação",120);
        anime.imprimir();

    }
}
