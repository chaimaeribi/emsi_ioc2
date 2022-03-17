package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application","metier","ext");
        IMetier metier= (IMetier) context.getBean("metier");
        System.out.println("Resultat=>"+metier.calcul());
    }
}
