package arbrebinaire;

/*
 * @author Epulapp
 */
public interface Visiteur {
    public void visiteNegation(Negation n, OperateurUnaire ou);
    
    public void visiteAddition(Addition a, OperateurUnaire ou);
    
    public void visiteMultiplication(Multiplication m, OperateurUnaire ou);
    
    public void visiteConstante(Constante c, OperateurUnaire ou);
}