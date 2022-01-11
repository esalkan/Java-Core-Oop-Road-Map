package oop.JOOP46_Collections_Part01;

/**
 * @author esalkan
 * @project java-notes
 */
public class Product implements Comparable<Product>{
    private String name;
    private double price;

    /**
     * @param name Product Name
     * @param price Product Price
     */
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     * When add to the class "implements Comparable< ClassName > below @Override method need to be created
     * and need to write some custom codes.
     *
     * This method returns int in 3 types
     * 1. positive number -> this Product is larger than another product
     * 2. zero -> this Product and another product are equal
     * 3. negative number -> this product is smaller than another product
     *
     * This method coming from Comparable Interface and that's why need to override for use compareTo method
     */
    @Override
    public int compareTo(Product anotherProduct) {
        // Custom codes
        if (this.price > anotherProduct.price){
            return 1;
        } else if (this.price == anotherProduct.price){
            return 0;
        } else{
            return -1;
        }
    }
}
