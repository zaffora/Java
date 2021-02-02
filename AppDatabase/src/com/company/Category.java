package com.company;

public class Category {


    /********************************
     * constructors
     */

    public Category(double category_id, String category) {
        this.category_id = category_id;
        this.category = category;
    }


    /**
     *
     * @return
     */
    public double getCategory_id() {
        return category_id;
    }

    public void setCategory_id(double category_id) {
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

    double category_id;
    String category;

}
