package introducao.classe.test;

import introducao.classe.modeo.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Pedro";
        estudante.idade = 'M';
        estudante.sexo = 'F';

        estudante2.nome = "Pedro";
        estudante2.idade = 'M';
        estudante2.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2);


    }
}
