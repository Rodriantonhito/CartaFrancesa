package cartafrancesa;

/**
 *
 * @author usuario
 */
public class CartaFrancesa {
    public static final int AS = 0;    
    public static final int J = 10;
    public static final int Q = 11;
    public static final int K = 12;
    public static final int TREBOLES = 0 ;
    public static final int PICAS = 1;
    public static final int DIAMANTES = 2;
    public static final int CORAZONES = 3;     
    public static final int COMODIN=4;
    public String treboles;
    public String corazones;
    public String picas;
    public String diamantes;
    private int palo;
    private int numero;
    
    public CartaFrancesa(int palo, int numero){
        this.palo = palo;
        this.numero = numero;

    }

    public int getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }
    
}
