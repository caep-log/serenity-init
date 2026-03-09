package models;

public class Product {

    private String name;
    private String category;
    private Number value;

    public Product(String name, String category, Number value){
        this.name = name;
        this.category = category;
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public Number getValue(){
        return value;
    }
}