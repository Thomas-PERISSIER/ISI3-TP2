package arbrebinaire;

public abstract class OperateurUnaire implements Noeud {

    private final String op;
    private final Noeud opG;

    OperateurUnaire(String s, Noeud n) {
        op = s;
        opG = n;
    }

    public String getOp() {
        return op;
    }

    public Noeud getOpG() {
        return opG;
    }
    
}