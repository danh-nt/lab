package lab4;

public class baitap {
    class Circle {
        private Double radius;
        private String color;
        private Double area;

        public Circle() {
            super();
        }

        public Circle(Double radius, String color, Double area) {
            this.radius = radius;
            this.color = color;
            this.area = area;
        }

        public Double getRadius() {
            return radius;
        }

        public void setRadius(Double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Double getArea() {
            return area;
        }

        public String toString() {
            return this.radius + "," + this.color;
        }

    }

    class Cylinder extends Circle {
        private Double height;

        public Cylinder(Double height) {
            this.height = height;
        }

        public Cylinder(Double radius, String color, Double height) {

            super.radius = radius;
            super.color = color;
            this.height = height;
        }

        public Double getHeight() {
            return height;
        }

        public void setHeight(Double height) {
            this.height = height;
        }

        public Double getVolume() {
            return getArea() * height;
        }
    }
}
