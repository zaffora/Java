package zaffora;

public class Food extends Product {
    String experation;

    public Food(String fuji_apples, double v, String s) {
        super();
        experation = s;
        super.wPrice = v;
        super.name = fuji_apples;

    }
    public String toString(){
        return String.format("%s\t%f\t%s", super.name, super.wPrice, experation);
    }
}
