package co.edu.sena.ficha2687350.model.repository;

import co.edu.sena.ficha2687350.model.Beans.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface ProductRepositorylmpl {
    List<Product> listAllObj() throws SQLException;


    Product byIdObj(Integer id) throws SQLException;


    Integer saveObj( Product t ) throws SQLException;

    void deleteObj ( Integer id ) throws SQLException;

    Product  createObj ( ResultSet rs ) throws SQLException;
}
