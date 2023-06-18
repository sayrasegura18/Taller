package co.edu.sena.ficha2687350.model.repository;

import co.edu.sena.ficha2687350.model.Beans.Category;
import co.edu.sena.ficha2687350.util.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Categorylmpl implements CategoryRepositorylmpl {
    private String sql = null;

    @Override
    public List<Category> listAllOb() throws SQLException {
        sql = "SELECT category_id, category_name FROM categories_tbl";
        List<Category> categories = new ArrayList<>();

        try (Connection conn = ConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Category category = createObj(rs);
                categories.add(category);
            }
        }

        return categories;
    }

    @Override
    public Category byIdObj(Integer id) throws SQLException {
        sql = "SELECT category_id, category_name FROM categories_tbl WHERE category_id = ?";
        Category category = null;

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    category = createObj(rs);
                }
            }
        }

        return category;
    }

    @Override
    public Integer saveObj(Category category) throws SQLException {
        int rowAffected = 0;

        if (category.getCategory_id() != null && category.getCategory_id() > 0) {
            sql = "UPDATE categories_tbl SET category_name = ? WHERE category_id = ?";
        } else {
            sql = "INSERT INTO categories_tbl (category_name) VALUES (?)";
        }

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, category.getCategory_name());

            if (category.getCategory_id() != null && category.getCategory_id() > 0) {
                ps.setInt(2, category.getCategory_id());
            }

            rowAffected = ps.executeUpdate();
        }

        return rowAffected;
    }

    @Override
    public void deleteObj(Integer Id) throws SQLException {

        sql = "DELETE FROM categories_tbl WHERE category_id = ?";

        try (Connection conn = ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, Id);
            ps.executeUpdate();
        }
    }

    @Override
    public Category createObj(ResultSet rs) throws SQLException {
        Category category = new Category();
        category.setCategory_id(rs.getInt("category_id"));
        category.setCategory_name(rs.getString("category_name"));
        return category;
    }
}
