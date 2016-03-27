package arbrebinaire;

public class Addition extends OperateurBinaire {

    public Addition(Noeud ng, Noeud nd) {
        super("+", ng, nd);
    }
    
    @Override
    public void accept(Visiteur visiteur, OperateurUnaire ou) {
        visiteur.visiteAddition(this, ou);
    }

}