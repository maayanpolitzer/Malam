package server.model;

public class Item {

    //private static int counter = 0;   // testing

    private int id;
    private String name;
    private double price;

    public Item() {
    }

    public Item(String name, double price) {
        //id = ++counter;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
