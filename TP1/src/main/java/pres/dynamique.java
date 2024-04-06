package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class dynamique {
    public static void main(String[] args) throws Exception {
        System.out.println("version dynamiqure");
        Scanner sc = new Scanner(new File("config.txt"));
        String ClassName = sc.nextLine();
        Class d = Class.forName(ClassName);
        IDao dao = (IDao) d.getConstructor().newInstance();

        ClassName = sc.nextLine();
        Class cmetier = Class.forName(ClassName);
        IMetier metier = (IMetier) cmetier.getConstructor(IDao.class).newInstance(dao);
        System.out.println(metier.calcul()); //Lecture des noms de classe à partir d'un fichier de config et utilisation de la réflexion pour instancier les objets
    }
}
