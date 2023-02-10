
public class Escuderia {

    private String nome;
    private int peso;

    public Escuderia() {
        this("", 0);
    }

    public Escuderia(String nome, int peso) {
        setNome(nome);
        setPeso(peso);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }
}
