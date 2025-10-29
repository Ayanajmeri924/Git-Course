import java.util.Scanner;

class Item {
    private String name;
    private int quantity;
    private float price;

    public Item(String name, int quantity, float price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public float getPrice() {
        return price;
    }

    public boolean isMatch(String other) {
        return name.equalsIgnoreCase(other);
    }
}

class Inventory {
    private Item[] items;
    private float totalMoney;
    private int itemCount;
    private static final int MAX_ITEMS = 20;
    private Scanner sc = new Scanner(System.in);

    public Inventory() {
        items = new Item[MAX_ITEMS];
        totalMoney = 0;
        itemCount = 0;
    }

    private void displayData(Item item) {
        System.out.println("\nItem name: " + item.getName());
        System.out.println("Quantity: " + item.getQuantity());
        System.out.println("Price: " + item.getPrice());
    }

    public void addItem() {
        System.out.print("\nEnter item name: ");
        String name = sc.next();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter price: ");
        float price = sc.nextFloat();

        if (itemCount < MAX_ITEMS) {
            items[itemCount] = new Item(name, quantity, price);
            itemCount++;
            System.out.println("Item added successfully!");
        } else {
            System.out.println("Inventory full, cannot add more items!");
        }
    }

    public void sellItem() {
        System.out.print("\nEnter item name to sell: ");
        String itemToCheck = sc.next();

        for (int i = 0; i < itemCount; i++) {
            if (items[i].isMatch(itemToCheck)) {
                removeItem(i);
                return;
            }
        }
        System.out.println("\nThis item is not in your inventory.");
    }

private void removeItem(int itemIndex) {
    System.out.print("Enter number of items to sell: ");
    int inputQuantity = sc.nextInt();

    Item item = items[itemIndex];
    int quantity = item.getQuantity();

    if (inputQuantity <= quantity) {
        float moneyEarned = item.getPrice() * inputQuantity;
        int newQuantity = quantity - inputQuantity;
        item.setQuantity(newQuantity);
        System.out.println("Items sold successfully!");
        System.out.println("Money received: " + moneyEarned);
        totalMoney += moneyEarned;

        // NEW PART: remove item from array if quantity = 0
        if (newQuantity == 0) {
            System.out.println("Item '" + item.getName() + "' is now sold out and removed from inventory.");
            // shift all items left
            for (int i = itemIndex; i < itemCount - 1; i++) {
                items[i] = items[i + 1];
            }
            items[itemCount - 1] = null; // clear last slot
            itemCount--; // reduce count
        }
    } else {
        System.out.println("Cannot sell more items than available.");
    }
}


    public void listItems() {
        if (itemCount == 0) {
            System.out.println("\nInventory empty.");
            return;
        }

        for (int i = 0; i < itemCount; i++) {
            displayData(items[i]);
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventorySystem = new Inventory();
        int choice;

        System.out.println("Welcome to the Inventory System!");

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Add new item");
            System.out.println("2. Sell item");
            System.out.println("3. List items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inventorySystem.addItem();
                    break;
                case 2:
                    inventorySystem.sellItem();
                    break;
                case 3:
                    inventorySystem.listItems();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice entered!");
            }
        }
    }
}
