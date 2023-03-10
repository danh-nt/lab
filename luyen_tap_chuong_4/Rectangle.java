package luyen_tap_chuong_4;

public class Rectangle extends Shape {
    Double width = 1.0;
    Double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(Double width, Double length, String color, Boolean filled) {
        this.width = width;
        this.length = length;
        super.color = color;
        super.filled = filled;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getArea() {
        return width * length;
    }

    public Double getPerimeter() {
        return (width + length) * 2;
    }

    public String toString() {

        return "Rectangle:(" + "width: " + width + ", length: " + length + ", Area: " + width * length + ", Perimeter: "
                + (width + length) * 2 + ")"
    }
}
