
public class Piloto {

    private String nome;
    private int peso;

    public Piloto() {
        this("", 0);
    }

    public Piloto(String nome, int peso) {
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
