public class Square extends Shape implements Resizeable{
    private double width;
    public Square(){

    }
    public Square(double width, String color, boolean filled){
        this.width = width;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return (Math.pow(this.getWidth(), 2));
    }
    @Override
    public String toString() {
        return "Square{" +
                "size=" + width +
                ", color is " + super.getColor() +
                ", filled is " + super.isFilled() +
                ", area = " + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width *= (percent / 200);
    }
}
