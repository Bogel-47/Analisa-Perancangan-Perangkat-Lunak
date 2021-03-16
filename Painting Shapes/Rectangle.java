public class Rectangle extends Shape{
    private double widht;
    private double length;

    public Rectangle(double w, double l){
        super("Rectangle");
        widht = w;
        length = l;
    }

    @Override
    public double area(){
        return widht*length;
    }
    
    @Override
    public String toString(){
        return super.toString()+ "of Lenght " + length + " and widht " + widht;
    }
}