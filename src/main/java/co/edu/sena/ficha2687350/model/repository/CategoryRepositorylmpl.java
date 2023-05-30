package co.edu.sena.ficha2687350.model.repository;

import co.edu.sena.ficha2687350.model.Beans.Category;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
public interface CategoryRepositorylmpl {

        List<Category> listAllOb() throws SQLException;


        Category byIdObj(Integer id) throws SQLException;


        Integer saveObj( Category t ) throws SQLException;

        void deleteObj ( Integer id ) throws SQLException;

        Category  createObj ( ResultSet rs ) throws SQLException;


}
