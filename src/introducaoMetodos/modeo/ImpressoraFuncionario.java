package introducaoMetodos.modeo;

public class ImpressoraFuncionario {
    public void imprimirF(Funcionario funcionario) {

        System.out.println("----------------------------");
        System.out.println("Nome" + funcionario.nome);
        System.out.println("Idade" + funcionario.idade);

        for(double salario : funcionario.salario) {
            System.out.println(salario + " ");
        }

    }
    public void imprimirMedia(Funcionario funcionario) {
        double media = 0;
        for(double salario : funcionario.salario) {
            media += salario;
        }
        media /=  funcionario.salario.length;
        System.out.println("Media" + media);
    }
}
