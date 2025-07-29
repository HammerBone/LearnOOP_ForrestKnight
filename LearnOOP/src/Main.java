public class Main {
    public static void main(String[] args) {
        Inventory myInventory = new Inventory();

        Item item_1 = new Item("Keyboard", 1);
        Item item_2 = new Item("Mouse", 1);

        myInventory.addItem(item_1);
        myInventory.addItem(item_2);

        myInventory.showInventory();
    }
}