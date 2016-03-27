package arbrebinaire;

public class Multiplication extends OperateurBinaire {

    public Multiplication(Noeud ng, Noeud nd) {
        super("*", ng, nd);
    }

    @Override
    public void accept(Visiteur visiteur, OperateurUnaire ou) {
        visiteur.visiteMultiplication(this, ou);
    }

}