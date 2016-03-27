package test;

import arbrebinaire.Addition;
import arbrebinaire.Constante;
import arbrebinaire.ExpressionArithmetique;
import arbrebinaire.Multiplication;
import arbrebinaire.Negation;

public class TestArbreBinaire {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //faire 1+2*3+-4=3
        Addition racine = new Addition(new Addition(new Constante(1),
                new Multiplication(new Constante(2), new Constante(3))),
                new Negation(new Constante(4)));
        ExpressionArithmetique exp = new ExpressionArithmetique(racine);
        
        //faire 7*(2+3)
        Multiplication racine2 = new Multiplication(new Constante(7),
                new Addition(new Constante(2), new Constante(3)));
        ExpressionArithmetique exp2 = new ExpressionArithmetique(racine2);
        
        exp.afficherInFixe();
        System.out.println("\n calcul valeur: " + exp.calculerValeur());
        System.out.println("\n calcul hauteur: " + exp.calculerHauteur());
        exp.afficherPostFixe();
        
        exp2.afficherInFixe();
        System.out.println("\n calcul valeur: " + exp2.calculerValeur());
        System.out.println("\n calcul hauteur: " + exp2.calculerHauteur());
        exp2.afficherPostFixe();
    }
}