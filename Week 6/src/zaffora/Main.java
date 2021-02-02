package zaffora;

public class Main {

    public static void main(String[] args) {
        Product computer = new Product("Computer", 1400);
        Product iPhone = new Product("iPhone XR", 400, 600);
        Product Galaxy10 = new Product("Samsung Galaxy S10", 700, 900, "Phone with 128GB memory.");

        Product book = new Book("Starting out with C++", (float) 150.00);

        Product apple = new Food("Fuji Apples", 3.50, "Dec. 1, 2019");

        Product[] inventory = {computer, iPhone, Galaxy10, book, apple};

        System.out.println("Viewing Store Products:");
        for (Product item: inventory) {
            System.out.println(item);
        }
    }
}
