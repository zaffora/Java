package zaffora;

import java.util.ArrayList;

public class Main {

    static ArrayList<Product> inventory = new ArrayList<>();

    public static void main(String[] args) {
        Product computer = new Product("Computer", 1400);
        Product iPhone = new Product("iPhone XR", 400, 600);
        Product Galaxy10 = new Product("Samsung Galaxy S10", 700, 900, "Phone with 128GB memory.");
        Product book = new Book("Starting out with C++", 150.00);
        Product apple = new Food("Fuji Apples", 3.50, "Dec. 1, 2019");

        updateStock(computer, 3);
        updateStock(iPhone, 6);
        updateStock(Galaxy10, 8);
        updateStock(book, 3);
        updateStock(apple, 150);

        addNewProduct(computer);
        addNewProduct(iPhone);
        addNewProduct(Galaxy10);
        addNewProduct(book);
        addNewProduct(apple);

        viewInventoryDetails();

        viewLowStock();
    }

    static void updateStock(Product item, int amount){
        item.setStock(amount);
    }

    static void addNewProduct(Product item){
        inventory.add(item);
    }

    static void viewInventoryDetails(){
        for (Product i : inventory){
            System.out.println(i);
        }
    }

    static void viewLowStock(){
        for (Product y : inventory){
            if (y.getStock() < 5){
                System.out.println(y);
            }
        }
    }
}
