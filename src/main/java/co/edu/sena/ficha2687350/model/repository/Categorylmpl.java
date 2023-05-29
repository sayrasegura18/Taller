package co.edu.sena.ficha2687350.model.repository;

import co.edu.sena.ficha2687350.model.Beans.Category;
import co.edu.sena.ficha2687350.util.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Categorylmpl implements CategoryRepositorylmpl {
        private String sql = null;

        @Override
        public List<Category> listAllObj() throws SQLException {
            sql = "SELECT c.categoryId, c.categoryName " +
                    "FROM categories_tbl c ORDER BY c.categoryName";
            List<Category> categories = new ArrayList<>();
            try (Connection conn = ConnectionPool.getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = ((Statement) stmt).executeQuery(sql)) {
                while (rs.next()) {
                    Category c = createObj(rs);
                    categories.add(c);
                }
            }
            return categories;
        }

        @Override
        public Category byIdObj(Integer id) throws SQLException {
            sql = "SELECT c.categoryId, c.categoryName " +
                    "FROM categories_tbl c WHERE c.categoryId = ?";
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
            int rowsAffected = 0;
            if (Category.getCategoryId() != null && Category.getCategoryId() > 0) {
                sql = "UPDATE categories_tbl SET categoryName = ? " +
                        "WHERE categoryId = ?";
            } else {
                sql = "INSERT INTO categories_tbl (categoryName) " +
                        "VALUES (UPPER(?))";
            }
            try (Connection conn = ConnectionPool.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, category.getCategoryName());
                if (Category.getCategoryId() != null && Category.getCategoryId() > 0) {
                    ps.setInt(2, category.getCategoryId());
                }
                rowsAffected = ps.executeUpdate();
            }
            return rowsAffected;
        }

        @Override
        public void deleteObj(Integer id) throws SQLException {
            sql = "DELETE FROM categories_tbl WHERE categoryId = ?";
            try (Connection conn = ConnectionPool.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.executeUpdate();
            }
        }

        @Override
        public Category createObj(ResultSet rs) throws SQLException {
            Category category = new Category();
            category.setCategoryId(rs.getInt("category_id"));
            category.setCategoryName(rs.getString("category_name"));
            return category;
        }
    }
