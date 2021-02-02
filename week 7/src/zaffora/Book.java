package zaffora;

public class Book extends Product {

    public Book(String name, double rPrice){
        super();
        setName(name);
        setrPrice(rPrice);


    }

    @Override
    public void setStock(int stock) {
        super.setStock(stock);
    }

    @Override
    public int getStock() {
        return super.getStock();
    }

    public String toString(){

        System.out.println("Name: " + super.name + "\tDescription: " + super.description + "\tWholesale Price: $" + super.wPrice + "\tRetail Price: $" + rPrice + "\tStock: " + super.stock + "\n");
        return "\n";
    }

}
