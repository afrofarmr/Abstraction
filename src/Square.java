public class Square extends Shapes{
    double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    double area() {
        return Math.pow(side, 2);
    }

    @Override
    String info() {
        return "This is a " + super.color + "Square with area" + area();
    }
}
