package luyen_tap_chuong_4;

public class Square extends Rectangle {
    Double side;

    public Square() {

    }

    public Square(Double side) {
        this.side = side;
    }

    public Square(Double side, String color, Boolean filled) {
        this.side = side;
        super.color = color;
        super.filled = filled;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public void setWidth(Double side) {
        super.width = side;
    }

    public void setLength(Double side) {
        super.length = side;
    }

    public String toString() {

        return "Square: (" + "side: " + side + ", color: " + color + ", filled: " + filled + ")";
    }
}