
public class Punkt {
    
    private double x;
    private double y;
    public Punkt() {}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void wypisz(){
        System.out.println("("+getX()+";"+getY()+")");
    }
}
