package arbrebinaire;

/*
 * @author Epulapp
 */
public class ParcoursHauteur implements Visiteur {
    
    private int resultat;
    private int tempResultat;
    
    public int getResultat() {
        return resultat;
    }
    
    @Override
    public void visiteNegation(Negation n, OperateurUnaire ou) { 
        int res = ++tempResultat;
        
        n.getOpG().accept(this, ou);
        tempResultat = res;
    }

    @Override
    public void visiteAddition(Addition a, OperateurUnaire ou) {
        int res = ++tempResultat;
        
        a.getOpG().accept(this, ou);
        tempResultat = res;
        
        a.getOpD().accept(this, ou);
        tempResultat = res;
    }

    @Override
    public void visiteMultiplication(Multiplication m, OperateurUnaire ou) {
        int res = ++tempResultat;
        
        m.getOpG().accept(this, ou);
        tempResultat = res;
        
        m.getOpD().accept(this, ou);
        tempResultat = res;
    }

    @Override
    public void visiteConstante(Constante c, OperateurUnaire ou) {
        tempResultat++;
        
        if (tempResultat > resultat) {
            resultat = tempResultat;
        }
        tempResultat = 0;
    }
}