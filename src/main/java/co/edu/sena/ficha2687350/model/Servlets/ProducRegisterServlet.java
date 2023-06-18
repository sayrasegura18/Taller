package co.edu.sena.ficha2687350.model.Servlets;
import co.edu.sena.ficha2687350.model.repository.ProductRepositorylmpl;
import co.edu.sena.ficha2687350.model.Beans.Product;
import co.edu.sena.ficha2687350.model.repository.Productlmpl;
import co.edu.sena.ficha2687350.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("registerProduct")
public class ProducRegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String product_name = request.getParameter("product_name");
        Integer product_value = Integer.valueOf(request.getParameter("product_value"));
        Integer category_id = Integer.valueOf(request.getParameter("category_id"));
        Product product = new Product();
        product.setproduct_name(product_name);
        product.setproduct_value(product_value);
        product.setproduct_id(category_id);

        // call repository layer and save the user object to DB
        Repository<Product> repository = (Repository<Product>) new Productlmpl(); int rows = 0;
        try {
            repository.saveObj(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(rows==0){
            System.out.println("Ocurrio un error");
        }else{
            System.out.println("Registro exitoso");
        }

    }
}
