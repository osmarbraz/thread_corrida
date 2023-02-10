
public class Automovel implements Runnable {

    private Escuderia escuderia;
    private Piloto piloto;
    private int voltas;
    private int tempo = 0;

    public Automovel() {
        this(null, null, 0);
    }

    public Automovel(Escuderia escuderia, Piloto piloto, int voltas) {
        setEscuderia(escuderia);
        setPiloto(piloto);
        setVoltas(voltas);
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setVoltas(int voltas) {
        this.voltas = voltas;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public int getVoltas() {
        return voltas;
    }

    @Override
    public void run() {
        int total = 0;
        for (int i = 1; i < getVoltas(); i++) {
            tempo = (getEscuderia().getPeso() + getPiloto().getPeso());
            total += tempo;
            try {
                Thread.sleep((long) tempo);
            } catch (InterruptedException ie) {
            }
            System.out.println("Piloto: " + getPiloto().getNome() + " fez a " + i + "a volta.");
        }
        System.out.println("Piloto: " + getPiloto().getNome() + " demorou " + total);
    }
}
