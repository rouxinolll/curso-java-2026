package introducaoMetodos.test;

import introducaoMetodos.modeo.Funcionario;
import introducaoMetodos.modeo.ImpressoraFuncionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        ImpressoraFuncionario impressoraFunc = new ImpressoraFuncionario();

        funcionario1.setNome("Joao");
        funcionario1.setIdade(19);
        funcionario1.setSalario(new double[]{2000,3000,4000});

        impressoraFunc.imprimirF(funcionario1);
        impressoraFunc.imprimirMedia(funcionario1);



    }
}
