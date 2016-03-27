package arbrebinaire;

public class ExpressionArithmetique {

    private final Noeud racine;

    public ExpressionArithmetique(Noeud racine) {
        this.racine = racine;
    }

    public Noeud getRacine() {
        return racine;
    }

    public void afficherPostFixe() {
        ParcoursPostfixe PPF = new ParcoursPostfixe();
        System.out.print("\n postfixe: ");
        racine.accept(PPF, null);
        System.out.println("");
    }

    public int calculerValeur() {
        ParcoursCalculer PC = new ParcoursCalculer();
        racine.accept(PC, null);
        return PC.getResultat();
    }

    public int calculerHauteur() {
        ParcoursHauteur PH = new ParcoursHauteur();
        racine.accept(PH, null);
        return PH.getResultat();
    }

    public void afficherInFixe() {
        ParcoursInfixe PI = new ParcoursInfixe();
        System.out.print("\n infixe: ");
        racine.accept(PI, null);
        System.out.println("");
    }

}