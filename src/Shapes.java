abstract class Shapes {
    String color;

    public Shapes(String color){
        this.color = color;
    }

    abstract double area();
    abstract String info();

    public String getColor(){
        return color;
    }
}
