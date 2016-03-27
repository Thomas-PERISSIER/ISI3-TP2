package arbrebinaire;

public class Constante implements Noeud {

    private final int valeur;

    public Constante(int v) {
        valeur = v;
    }

    public int getValeur() {
        return valeur;
    }

    @Override
    public void accept(Visiteur visiteur, OperateurUnaire ou) {
        visiteur.visiteConstante(this, ou);
    }

}