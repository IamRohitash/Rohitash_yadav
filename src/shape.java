
public abstract class shape
{
    String color;
    abstract double area();

    public shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
class Circle extends shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return ("Circle color is:" + super.color + "and area of circle is:" + area());
    }
}

class Rectangle extends shape
{
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return ("color of rectanle is :"+super.color+" and area if rectanle is:"+area());
    }

    @Override
    double area() {
        return length*width;
    }
}

class Test {
    public void main(String[] args) {
        shape c=new Circle("white",4.5);
        shape r=new Rectangle("Red",45,90);
        System.out.println(c.toString());
        System.out.println(r.toString());
    }
}
