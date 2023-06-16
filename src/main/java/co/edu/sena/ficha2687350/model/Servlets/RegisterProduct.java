package co.edu.sena.ficha2687350.model.Servlets;

import co.edu.sena.ficha2687350.model.Beans.Product;
import co.edu.sena.ficha2687350.model.repository.ProductRepositorylmpl;
import co.edu.sena.ficha2687350.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/register-product")
public class RegisterProduct extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Repository<Product> repository = new ProductRepositorylmpl();
        String ProductName = req.getParameter("productname");
        Integer ProductValue = Integer.valueOf(req.getParameter("valueproduct"));
        Integer ProductCategory = Integer.valueOf(req.getParameter("idcategory"));
        Product productInsert = new Product();
        int rows =0;
        productInsert.setName(ProductName);
        productInsert.setValue(ProductValue);
        productInsert.setId(ProductCategory);
        try {
            rows = repository.saveObj(productInsert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (rows ==0) {
            System.out.println("error");
        } else {
            req.getRequestDispatcher("./Success.jsp").forward(req, resp);
        }



    }
}

