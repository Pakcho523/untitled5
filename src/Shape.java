abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape
{
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    public double perimeter() {
        return 2*Math.PI*r;
    }
    public double area() {
        return Math.PI*r*r;
    }
}
class Rectangle extends Shape {
    private double S1;
    private double S2;
    public Rectangle(double s1, double s2)
    {
        S1=s1; S2=s2;
    }
    public double perimeter(){
        return 2*(S1+S2);
    }
    public double area(){ return S1*S2;
    }
  }
class TestPoly {
    public static void main(String[] args) {
    Shape s1=new Circle(10);
    System.out.println("圆形面积是:"+s1.area());
    System.out.println("圆形周长是:"+s1.perimeter());
    Shape s2=new Rectangle(2, 3);
    System.out.println("长方形面积是:"+s2.area());
    System.out.println("长方形周长是:"+s2.perimeter());
   }
 }
