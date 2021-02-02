package sample;

public class Category {


    /********************************
     * constructors
     */

    public Category(){}

    public Category(int category_id, String category) {
        this.category_id = category_id;
        this.category = category;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *  field
     */

    int category_id;
    String category;
    @Override
    public String toString(){

        return "Category_id: " + category_id + "; Category: " +  category ;

    }


}
