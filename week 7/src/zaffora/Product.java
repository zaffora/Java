package zaffora;

public class Product {
    String name = "null", description = "null";
    double wPrice = 0, rPrice = 0;
    int stock=0;

    public Product(String name, double wPrice, double rPrice, String description){
        setName(name);
        setwPrice(wPrice);
        setrPrice(wPrice);
        setDescription(description);

    }

    public Product(String computer, double i) {
        setName(computer);
        setrPrice(i);
    }

    public Product(String iPhone_xr, double i, double i1) {
        setName(iPhone_xr);
        setwPrice(i);
        setrPrice(i1);
    }

    public Product() {

    }

    public void setName(String name){
        this.name = name;
    }
    public void setwPrice(double wPrice){
        this.wPrice = wPrice;
    }
    public void setrPrice(double rPrice){
        this.rPrice = rPrice;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setStock(int stock) {this.stock = stock; }

    public int getStock() {return stock;}

    public String toString(){
        System.out.println("Name: " + name + "\tDescription: " + description + "\tWholesale Price: $" + wPrice + "\tRetail Price: $" + rPrice + "\tStock: " + stock + "\n");
        return "\n";
    }
}
