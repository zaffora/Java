package zaffora;

public class Main {

    public static void main(String[] args) {
        Product computer = new Product();
        computer.setName("Computer");
        computer.setWholesalePrice(1400);
        computer.setRetailPrice(1200);

        Product iPhone = new Product();
        iPhone.setName("iPhone XR");
        iPhone.setWholesalePrice(400);
        iPhone.setRetailPrice(600);

        Product galaxy10 = new Product();
        galaxy10.setName("Samsung Galaxy S10");
        galaxy10.setWholesalePrice(700);
        galaxy10.setRetailPriceByPercentage(25);
        galaxy10.setDescription("Phone with 128GB memory.");

        Product[] inventory = {computer, iPhone, galaxy10};

        System.out.println("Viewing Store Products:");
        for (Product item: inventory) {
            if(item.getRetailPrice() < item.getWholesalePrice())
                System.out.println("Warning " + item.getName() + " has a lower Retail price than wholesale.");
            System.out.printf("\n" + item.getName() + ", Description: " + item.getDescription() + ", Retail: $%.2f, Wholesale: $%.2f", item.getRetailPrice(), item.getWholesalePrice());
        }
    }
}