package co.edu.sena.ficha2687350.model.repository;

import co.edu.sena.ficha2687350.model.Beans.Category;

import java.sql.SQLException;

public class TestCategoryRepositorylmpl {
    public static void main(String[] args) throws SQLException {
        CategoryRepositorylmpl repository = new Categorylmpl();

        System.out.println("========== saveObj Insert ==========");
        Category categoryInsert = new Category();
        categoryInsert.setName("Jabones");
        repository.saveObj(categoryInsert);
        categoryInsert.setName("Carnes");
        repository.saveObj(categoryInsert);

        System.out.println("========== listAllObj ==========");
        repository.listAllOb().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj ==========");
        Category categoryUpdate = new Category();
        categoryUpdate.setId(2);
        categoryUpdate.setName("Pan");
        repository.saveObj(categoryUpdate);
        repository.listAllOb().forEach(System.out::println);

        System.out.println("========== deleteObj ==========");
        repository.deleteObj(2);
        repository.listAllOb().forEach(System.out::println);
    }
}
