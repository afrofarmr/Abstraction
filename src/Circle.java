public class Circle extends Shapes{
    double radius;

    public Circle(String color, double v) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    String info() {
        return "This is a " + super.color + "Circle with area" + area();
    }

}
