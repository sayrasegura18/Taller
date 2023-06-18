package co.edu.sena.ficha2687350.model.Beans;


import java.sql.SQLException;

public  class Product {
        private Integer product_id;
        private String product_name;
        private double product_value;


        public Integer getproduct_id() {
            return product_id;
        }

        public void setproduct_id(Integer product_id) {
            this.product_id = product_id;
        }

        public String getproduct_name() {
            return product_name;
        }

        public void setproduct_name(String product_name) {
            this.product_name = product_name;
        }

        public double getproduct_value() {
            return product_value;
        }

        public void setproduct_value(double product_value) {
            this.product_value = product_value;
        }


    @Override
    public String toString() {
        String product_id = null;
        String product_name = null;
        String product_value;
        String categoryId = null;
        return "Product{" +
                "product_id=" + null +
                ", product_name='" + null + '\'' +
                ", product_value=" + null +
                ", category_id=" + null +
                '}';
    }

}