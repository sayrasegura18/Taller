package co.edu.sena.ficha2687350.model.Beans;


import java.sql.SQLException;

public  class Product {
        private Integer id;
        private String name;
        private double value;


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }


    @Override
    public String toString() {
        String productId = null;
        String productName = null;
        String productValue;
        productValue = null;
        String categoryId = null;
        return "Product{" +
                "productId=" + null +
                ", productName='" + null + '\'' +
                ", productValue=" + null +
                ", categoryId=" + null +
                '}';
    }

}