package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        /*
        Récupérer la température à travers la BD
         */
        System.out.println("Version DB");
        double temp=Math.random()*40;
        return 0;
    }
}
