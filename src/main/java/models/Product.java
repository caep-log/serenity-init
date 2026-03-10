package models;

public class Product {

    private String name;
    private String category;
    private Integer value;
    private Integer quantity;

    public Product(String name, String category, Integer value, Integer quantity){
        this.name = name;
        this.category = category;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public Integer getValue(){
        return value;
    }

    public Integer getQuantity(){ return quantity; }
}