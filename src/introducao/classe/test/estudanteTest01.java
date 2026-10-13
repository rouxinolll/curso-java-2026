package introducao.classe.test;

import introducao.classe.modeo.estudante;

public class estudanteTest01 {
    public static void main(String[] args) {
        estudante estudante = new estudante();
        estudante.nome = "Pedro";
        estudante.idade = 'M';
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

    }
}
