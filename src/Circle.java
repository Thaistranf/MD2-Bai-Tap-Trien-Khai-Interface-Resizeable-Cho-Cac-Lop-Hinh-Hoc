public class Circle extends Shape implements Resizeable{
    private double radius;
    public Circle(){

    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return (Math.PI * Math.pow(this.getRadius(), 2));
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", color is " + super.getColor() +
                ", filled is " + super.isFilled() +
                ", area = " + getArea() +
                '}';
    }
    @Override
    public void resize(double percent) {
        this.radius *= (percent / 200);
    }
}
