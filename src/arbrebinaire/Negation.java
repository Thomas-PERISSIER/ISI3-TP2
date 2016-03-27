package arbrebinaire;

public class Negation extends OperateurUnaire {

    public Negation(Noeud n) {
        super("-", n);
    }

    @Override
    public void accept(Visiteur visiteur, OperateurUnaire ou) {
        visiteur.visiteNegation(this, ou);
    }

}