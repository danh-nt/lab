package luyen_tap_chuong_4;

public class main {
    public static void main(String[] args) {
        Shape S = new Shape("BLACK", true);
        System.out.println(S.toString());

        Circle Ce = new Circle(2.1, "green", true);
        System.out.println(Ce.toString());

        Rectangle Re = new Rectangle(2.1, 1.0, "blue", true);
        System.out.println(Re.toString());

        Square Sq = new Square(4.5, "black", true);
        System.out.println(Sq.toString());
    }
}
