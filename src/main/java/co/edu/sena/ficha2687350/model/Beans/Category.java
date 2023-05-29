package co.edu.sena.ficha2687350.model.Beans;

public class Category {

    private int categoryId;
    private String categoryName;

    public Category() {
        // Constructor vacío
    }

    public static int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    public void setCategory_name(String pan) {
    }

    public void setCategory_id(int i) {
    }
}
