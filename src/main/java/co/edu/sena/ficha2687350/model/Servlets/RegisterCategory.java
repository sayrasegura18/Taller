package co.edu.sena.ficha2687350.model.Servlets;

import co.edu.sena.ficha2687350.model.Beans.Category;
import co.edu.sena.ficha2687350.model.repository.CategoryRepositorylmpl;
import co.edu.sena.ficha2687350.model.repository.Repository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/register-category")

public class RegisterCategory extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Repository<Category> repository = new CategoryRepositorylmpl();
        String name_category = req.getParameter("name_category");
        Category categoryInsert =new Category();
        int rows = 0;
        categoryInsert.setName(name_category);
        try {
            rows =repository.saveObj(categoryInsert);
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

}
