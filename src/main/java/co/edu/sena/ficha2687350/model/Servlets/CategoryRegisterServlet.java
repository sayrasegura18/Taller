package co.edu.sena.ficha2687350.model.Servlets;

        import co.edu.sena.ficha2687350.model.Beans.Category;
        import co.edu.sena.ficha2687350.model.repository.CategoryRepositorylmpl;
        import co.edu.sena.ficha2687350.model.repository.Categorylmpl;
        import co.edu.sena.ficha2687350.model.repository.Repository;
        import jakarta.servlet.ServletException;
        import jakarta.servlet.http.HttpServlet;
        import jakarta.servlet.http.HttpServletRequest;
        import jakarta.servlet.http.HttpServletResponse;

        import java.io.IOException;
        import java.sql.SQLException;

public class CategoryRegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  collect all form data
        String category_name = request.getParameter("category_name");



        //  fill it up in a User Bean
        Category category = new Category();
        category.setCategory_name(category_name);

        // call repository layer and save the user object to DB
        Repository<Category> repository = (Repository<Category>) new Categorylmpl();
        int rows = 0;
        try {
            repository.saveObj(category);
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


