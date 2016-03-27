package arbrebinaire;

/*
 * @author Epulapp
 */
public class ParcoursInfixe implements Visiteur {
    
    @Override
    public void visiteNegation(Negation n, OperateurUnaire ou) {
        if (ou != null) {
            if ("+".equals(ou.getOp()) || "*".equals(ou.getOp())) {
                System.out.print("(" + n.getOp());
                n.getOpG().accept(this, n);
                System.out.print(")");
            } else {
                n.getOpG().accept(this, n);
                System.out.print(n.getOp());
            }
        } else {
            n.getOpG().accept(this, n);
            System.out.print(n.getOp());
        }
    }

    @Override
    public void visiteAddition(Addition a, OperateurUnaire ou) {
        if (ou != null) {
            if ("*".equals(ou.getOp())) {
                System.out.print("(");
                a.getOpG().accept(this, a);
                System.out.print(a.getOp());
                a.getOpD().accept(this, a);
                System.out.print(")");
            } else {
                a.getOpG().accept(this, a);
                System.out.print(a.getOp());
                a.getOpD().accept(this, a);
            }
        } else {
            a.getOpG().accept(this, a);
            System.out.print(a.getOp());
            a.getOpD().accept(this, a);
        }
    }

    @Override
    public void visiteMultiplication(Multiplication m, OperateurUnaire ou) {
        m.getOpG().accept(this, m);
        System.out.print(m.getOp());
        m.getOpD().accept(this, m);
    }

    @Override
    public void visiteConstante(Constante c, OperateurUnaire ou) {
        System.out.print(c.getValeur());
    }

}