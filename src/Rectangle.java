public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double height;
    public Rectangle(){

    }
    public Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return (this.getWidth() * this.getHeight());
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width = " + width +
                ", height = " + height +
                ", color is " + super.getColor() +
                ", filled is " + super.isFilled() +
                ", area = " + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width *= (percent / 200);
        this.height *= (percent / 200);
    }
}
