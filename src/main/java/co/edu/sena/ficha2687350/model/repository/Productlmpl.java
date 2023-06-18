package co.edu.sena.ficha2687350.model.repository;

import co.edu.sena.ficha2687350.model.Beans.Product;
import co.edu.sena.ficha2687350.util.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Productlmpl implements ProductRepositorylmpl {
        private String sql = null;

        @Override
        public List<Product> listAllObj() throws SQLException {
            sql = "SELECT product_id, product_name, product_value FROM products_tbl";
            List<Product> products = new ArrayList<>();

            try (Connection conn = ConnectionPool.getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    Product product = createObj(rs);
                    products.add(product);
                }
            }

            return products;
        }

        @Override
        public Product byIdObj(Integer id) throws SQLException {
            sql = "SELECT product_id, product_name, product_value FROM products_tbl WHERE product_id = ?";
            Product product = null;

            try (Connection conn = ConnectionPool.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        product = createObj(rs);
                    }
                }
            }

            return product;
        }

        @Override
        public Integer saveObj(Product product) throws SQLException {
            int rowAffected = 0;

            if (product.getproduct_id() != null && product.getproduct_id() > 0) {
                sql = "UPDATE products_tbl SET product_name = ?, product_value = ? WHERE product_id = ?";
            } else {
                sql = "INSERT INTO products_tbl (product_name, product_value) VALUES (?, ?)";
            }

            try (Connection conn = ConnectionPool.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql)) {

                ps.setString(1, product.getproduct_name());
                ps.setDouble(2, product.getproduct_value());

                if (product.getproduct_id() != null && product.getproduct_id() > 0) {
                    ps.setInt(3, product.getproduct_id());
                }

                rowAffected = ps.executeUpdate();
            }

            return rowAffected;
        }

        @Override
        public void deleteObj(Integer id) throws SQLException {
            sql = "DELETE FROM products_tbl WHERE product_id = ?";

            try (Connection conn = ConnectionPool.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.executeUpdate();
            }
        }

        @Override
        public Product createObj(ResultSet rs) throws SQLException {
            Product product = new Product() {

            };
            product.setproduct_id(rs.getInt("product_id"));
            product.setproduct_name(rs.getString("product_name"));
            product.setproduct_value(rs.getDouble("product_value"));
            return product;
        }}
