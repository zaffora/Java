package zaffora;

public class Product {
    String name = "null", description = "null";
    double wPrice = 0, rPrice = 0;
    public Product(String name, float wPrice, float rPrice, String description){
        setName(name);
        setwPrice(wPrice);
        setrPrice(wPrice);

    }

    public Product(String computer, int i) {
    }

    public Product(String iPhone_xr, int i, int i1) {
    }

    public Product() {

    }

    public void setName(String name){
        this.name = name;
    }
    public void setwPrice(float wPrice){
        this.wPrice = wPrice;
    }
    public void setrPrice(float rPrice){
        this.rPrice = rPrice;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String toString(){
        return String.format("%s\t%f\t%f\t%s", name, wPrice, rPrice, description);
    }
}
