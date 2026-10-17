package sobrecargametodos.modeo;

public class Anime {
   private String nome;
    private  String tipo;
    private int ep;
    private String genero;

   public void init(String nome, String tipo, int ep){
       this.nome = nome;
       this.tipo = tipo;
       this.ep = ep;

   }
   public void init(String nome, String tipo){
       this.init(nome,tipo,ep);
       this.tipo = tipo;
   }
    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.ep);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }
}
