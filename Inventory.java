import java.util.*;

public class Inventory {
    private HashMap<String, Item> items = new HashMap<>();

    // Add item
    public void addItem(Item item) {
        items.put(item.getItemId(), item);
        System.out.println("Item added successfully!");
    }

    // Remove item
    public void removeItem(String id) {
        if (items.remove(id) != null) {
            System.out.println("Item removed!");
        } else {
            System.out.println("Item not found!");
        }
    }

    // Update quantity
    public void updateQuantity(String id, int qty) {
        Item item = items.get(id);
        if (item != null) {
            item.setQuantity(qty);
            System.out.println("Quantity updated!");
        } else {
            System.out.println("Item not found!");
        }
    }

    // Search by ID
    public void searchById(String id) {
        Item item = items.get(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Item not found!");
        }
    }

    // Search by Name
    public void searchByName(String name) {
        boolean found = false;
        for (Item item : items.values()) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Item not found!");
        }
    }

    // Display all
    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty!");
        } else {
            for (Item item : items.values()) {
                System.out.println(item);
            }
        }
    }
}
