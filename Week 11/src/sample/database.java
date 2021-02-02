package sample;

public class database {

    String app;
    double rating;

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



    @Override
    public String toString(){
        String output = "";
        output += app + ", " + rating;
        //return "Application Name: " + String.format("%s", app)  + "\nRating: " + String.format("%d", rating);
        return output;
    }
}
