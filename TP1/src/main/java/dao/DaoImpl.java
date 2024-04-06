package dao;

import org.springframework.stereotype.Repository;

@Repository

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("tempertaure");
        return 4565;
    }
}
