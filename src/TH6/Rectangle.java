package TH6;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double side, double v) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public Rectangle(double side, double v, String color, boolean filled) {
    }
}
