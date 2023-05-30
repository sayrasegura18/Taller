package co.edu.sena.ficha2687350.model.repository;

import co.edu.sena.ficha2687350.model.Beans.Product;


import java.sql.*;

import java.util.List;

public class TestProductRepositorylmpl {
    public static void main(String[] args) throws SQLException {
        ProductRepositorylmpl repository = new Productlmpl();

        System.out.println("========== saveObj Insert ==========");
        Product productInsert = new Product();
        productInsert.setName("Harina");
        productInsert.setValue(113212);
        repository.saveObj(productInsert);

        productInsert.setName("Lentejas");
        productInsert.setValue(12000);
        repository.saveObj(productInsert);

        System.out.println("========== listAllObj ==========");
        List<Product> products = repository.listAllObj();
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj ==========");
        Product productUpdate = new Product();
        productUpdate.setId(1);
        productUpdate.setName("Platano");
        productUpdate.setValue(125456);
        repository.saveObj(productUpdate);

        products = repository.listAllObj();
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("========== deleteObj ==========");
        repository.deleteObj(2);

        products = repository.listAllObj();
        for (Product product : products) {
            System.out.println(product);
        }
    }
}


