package arbrebinaire;

/*
 * @author Epulapp
 */
public class ParcoursPostfixe implements Visiteur {

    @Override
    public void visiteNegation(Negation n, OperateurUnaire ou) {
        n.getOpG().accept(this, ou);
        System.out.print(n.getOp());
    }

    @Override
    public void visiteAddition(Addition a, OperateurUnaire ou) {
        a.getOpG().accept(this, ou);
        a.getOpD().accept(this, ou);
        System.out.print(a.getOp());
    }

    @Override
    public void visiteMultiplication(Multiplication m, OperateurUnaire ou) {
        m.getOpG().accept(this, ou);
        m.getOpD().accept(this, ou);
        System.out.print(m.getOp());
    }

    @Override
    public void visiteConstante(Constante c, OperateurUnaire ou) {
        System.out.print(c.getValeur());
    }

}
