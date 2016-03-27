package arbrebinaire;

public interface Noeud {
    public void accept(Visiteur visiteur, OperateurUnaire ou);
}