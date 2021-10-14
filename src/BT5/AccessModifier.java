package BT5;

public class AccessModifier {
   double radius;
   String color ;

    public AccessModifier(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public AccessModifier() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AccessModifier{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
