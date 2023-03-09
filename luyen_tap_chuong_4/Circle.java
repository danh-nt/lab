package luyen_tap_chuong_4;

public class Circle extends Shape {
    Double radius = 1.0;
    Double Pi = 3.1415;

    public Circle() {

    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius, String color, Boolean filled) {
        this.radius = radius;
        super.color = color;
        super.filled = filled;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea() {
        return Pi * radius * radius;
    }

    public Double getPerimeter() {
        return 2 * Pi * radius;
    }

    @Override
    public String toString() {

        return "Circle:(" + "radius: " + radius + ", color: " + color + ", filled: " + filled + ", Area: "
                + Pi * radius * radius + ", Perimeter: " + 2 * Pi * radius + ")";
    }

}