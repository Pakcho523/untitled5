abstract class Shape {
    public abstract double area();
   }
class Circle extends Shape {
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    public double area() {
        return Math.PI*r*r;
    }
}
class Rectangle extends Shape{
    private double A;
    private double B;
    public Rectangle(double s1, double s2){
        A=s1; B=s2;
    }

    public double area(){ return A*B;
     }
 }
class TestPoly {
    public static void main(String[] args) {
        Shape s1=new Circle(10);
    System.out.println("圆形面积为:"+s1.area());
    Shape s2=new Rectangle(2, 3);
    System.out.println("长方形面积为:"+s2.area());
   }
 }
