package zaffora;

public class Book extends Product {

    public Book(String name, float wPrice){
        super();
        super.name = name;
        super.wPrice = wPrice;


    }
    public String toString(){
        return String.format("%s\t%f", super.name, super.wPrice);
    }

}
