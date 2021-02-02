package sample;

public class database {

    String app, reviews;
    double rating;
    int app_id;
    String app_name;
    int category_id;
    int review;
    String size;
    double prize;
    int installs;
    int content_rating_id;
    public database(){}

    public database(double rating, String app){
        this.rating = rating;
        this.app = app;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setReviews(String reviews){this.reviews = reviews;}

    public String getReviews(){return reviews;}

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public int getInstalls() {
        return installs;
    }

    public void setInstalls(int installs) {
        this.installs = installs;
    }

    public int getContent_rating_id() {
        return content_rating_id;
    }

    public void setContent_rating_id(int content_rating_id) {
        this.content_rating_id = content_rating_id;
    }



    @Override
    public String toString(){
        String output = "";
        output += app + ", Rating: " + rating + " , Review: " + reviews;
        //return "Application Name: " + String.format("%s", app)  + "\nRating: " + String.format("%d", rating);
        return output;
    }
}
