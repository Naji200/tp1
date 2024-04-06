package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XML {
    public static void main(String[] args) {
        System.out.println("version xml");
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        IMetier metier= context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
