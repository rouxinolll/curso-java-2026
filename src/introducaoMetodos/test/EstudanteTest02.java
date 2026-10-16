package introducaoMetodos.test;

import introducaoMetodos.modeo.Estudante;
import introducaoMetodos.modeo.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Pedro";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Micaelen";
        estudante02.idade = 16;
        estudante02.sexo = 'F';


        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
