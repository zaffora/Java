package zaffora;

public class Product {

    private String name="null", description="null";
    private float wPrice=0, rPrice=0;

   void setName(String name){
       this.name = name;
    }
    void setDescription(String description){
       this.description = description;
    }
    void setWholesalePrice(float wPrice){
       this.wPrice=wPrice;
    }
    void setRetailPrice(float rPrice){
       this.rPrice=rPrice;
    }
    void setRetailPriceByPercentage(int percent){
       this.rPrice = wPrice + wPrice*(percent/100);
    }

    String getName(){
       return name;
    }
    String getDescription(){
       return description;
    }
    float getRetailPrice(){
       if (rPrice < wPrice){
           System.out.println("Error, retail is less than wholesale. \n retail changed to 10%");
           rPrice = wPrice + wPrice/10;
       }

       return rPrice;
    }
    float getWholesalePrice(){
       return wPrice;
    }





}
