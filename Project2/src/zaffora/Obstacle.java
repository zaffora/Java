package zaffora;

public class Obstacle extends Main {

    private int x,y;

    public Obstacle(){
        super();
        setLocation();
    }

    public void setLocation(){
            x = (int)Math.random() * 10;
            y = (int)Math.random() * 10;
// The Do While loop tests to make sure the
// object doesn't start in the same position as the player.
           do {
               x = (int) Math.random() * 10;
               y = (int) Math.random() * 10;
           }while (x==0 & y==0);
                }


    public int getX(){return x;}
    public int getY(){return y;}

    public String toString(){
        System.out.println("Obstacle location is x:" + x + " y: " + y);
        return "/n";
    }
}
