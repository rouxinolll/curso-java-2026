package introducaoMetodos.modeo;

public class Funcionario {
    private String nome;
    private int idade;
    private double [] salario;
    private double media ;

    public void imprimirF(Funcionario funcionario) {

        System.out.println("----------------------------");
        System.out.println("Nome" + funcionario.nome);
        System.out.println("Nome" + funcionario.nome);
        System.out.println("Idade" + funcionario.idade);

        for(double salario : funcionario.salario) {
            System.out.println(salario + " ");
        }

    }
    public void imprimirMedia(Funcionario funcionario) {
        double media = 0;
        for(double salario : funcionario.getSalario()) {
            media += salario;
        }
        media /=  funcionario.salario.length;
        System.out.println("Media" + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }


}
