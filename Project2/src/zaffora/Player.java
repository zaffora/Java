package zaffora;



public class Player extends Main {


   private String name;
   private int x, y;

    public Player(){
        super();
        x=0;
        y=0;

    }

    public void setName(String tName){
        name = tName;
    }
    public String getName(){
        return name;
    }

    public int getX(){return x;}
    public int gety(){return y;}

    public String toString(){
        System.out.println("Player name is: " + name + "\n" +
                "Player location is x:" + x + " y: " + y);
        return "/n";
    }
}
