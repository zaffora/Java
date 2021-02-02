package zaffora;

public class Food extends Product {
    private String experation;

    public Food(String fuji_apples, double v, String s) {
        super();
        experation = s;
        setrPrice(v);
        setName(fuji_apples);

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

        System.out.println("Name: " + super.name + "\tDescription: " + super.description + "\tWholesale Price: $" + super.wPrice + "\tRetail Price: $" + rPrice + "Expiration: " + experation + "\tStock: " + super.stock + "\n");
        return "\n";
    }
}
