package pres;

import dao.DaoImpl;
import metier.MetierImpl;
// instan static
public class staticp {
    public static void main(String[] args) {
        System.out.println("version statique");
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println(metier.calcul());

    }


}
