package introducao.classe.test;

import introducao.classe.modeo.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Fusca";
        carro.modelo = "Fuscao Preto";
        carro.ano = 2000;

        carro2.nome = "Uno";
        carro2.modelo = "Uno Preto com Escada";
        carro2.ano = 2007;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("-------------");

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
