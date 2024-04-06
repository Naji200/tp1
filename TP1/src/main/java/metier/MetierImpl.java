package metier;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.stereotype.Service;

@Service

public class MetierImpl implements IMetier{

    IDao dao;
//    public MetierImpl()
//    {
//
//    }

    public MetierImpl(IDao dao)
    {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        return dao.getData()*40 ;
    }

    public void setDao(IDao dao)
    {
        this.dao = dao;
    }


}
