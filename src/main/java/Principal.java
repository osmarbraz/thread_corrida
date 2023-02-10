
public class Principal {

    public static final int VOLTAS = 10;

    public static void main(String args[]) {
        Piloto p1 = new Piloto("Rubens", 78 * 1);
        Piloto p2 = new Piloto("Piquet", 85 * 2);
        Piloto p3 = new Piloto("Airton", 60 * 3);
        Piloto p4 = new Piloto("Fernando", 73 * 4);
        Escuderia e1 = new Escuderia("Ferrari", 235 * 4);
        Escuderia e2 = new Escuderia("Mclarem", 245 * 3);
        Escuderia e3 = new Escuderia("Fiat", 260 * 2);
        Escuderia e4 = new Escuderia("Benneton", 240 * 1);
        Automovel a1 = new Automovel(e1, p1, VOLTAS);
        Automovel a2 = new Automovel(e2, p2, VOLTAS);
        Automovel a3 = new Automovel(e3, p3, VOLTAS);
        Automovel a4 = new Automovel(e4, p4, VOLTAS);
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);
        Thread t3 = new Thread(a3);
        Thread t4 = new Thread(a4);
        
        System.out.println("Largada!!!\n");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("\nFinal da corrida!!!");
    }
}
