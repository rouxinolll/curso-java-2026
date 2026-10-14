package introducao.classe.test;

import introducao.classe.modeo.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Pedro";
        professor.idade = 'M';
        professor.sexo = 'F';

        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);
        System.out.println(professor);

    }
}
