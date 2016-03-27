package arbrebinaire;

/*
 * @author Epulapp
 */
public class ParcoursCalculer implements Visiteur {
    
    private int resultat;

    public int getResultat() {
        return resultat;
    }
    
    @Override
    public void visiteNegation(Negation n, OperateurUnaire ou) {
        int resG;
        
        resultat = 0;
        n.getOpG().accept(this, ou);
        resG = resultat;
        
        resultat = resG * -1;
    }

    @Override
    public void visiteAddition(Addition a, OperateurUnaire ou) {
        int resG, resD;
        
        resultat = 0;
        a.getOpG().accept(this, ou);
        resG = resultat;
        
        resultat = 0;
        a.getOpD().accept(this, ou);
        resD = resultat;
        
        resultat = resG + resD;
    }

    @Override
    public void visiteMultiplication(Multiplication m, OperateurUnaire ou) {
        int resG, resD;
        
        resultat = 0;
        m.getOpG().accept(this, ou);
        resG = resultat;
        
        resultat = 0;
        m.getOpD().accept(this, ou);
        resD = resultat;
        
        resultat = resG * resD;
    }

    @Override
    public void visiteConstante(Constante c, OperateurUnaire ou) {
        resultat = c.getValeur();
    }

}
