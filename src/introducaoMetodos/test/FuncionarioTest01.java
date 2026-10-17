package introducaoMetodos.test;

import introducaoMetodos.modeo.Funcionario;


public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();



        funcionario1.setNome("Joao");
        funcionario1.setIdade(19);
        funcionario1.setSalario(new double[]{1000,2000,3000});

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getIdade());
        System.out.println(funcionario1.getSalario());

        funcionario1.imprimirF();
        System.out.println(funcionario1.getMedia());




    }
}
