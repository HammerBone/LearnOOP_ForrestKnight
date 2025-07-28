public class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    //This is encapsulation
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
