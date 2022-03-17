package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

import static java.lang.System.out;

public class Presentation {
    public static void main(String[] args) {
        /*
        Injection des dependances par
        instanciation statique => new
         */
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao);
        // metier.setDao(dao);
        out.println("Resultat = "+metier.calcul());
    }
}
