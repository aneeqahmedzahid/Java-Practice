import java.util.Scanner;

public class Main {
    public static class Circle {
        float rad, diam, area, circum;

        void setR() {
            Scanner S = new Scanner(System.in);
            System.out.print("Enter Radius: ");
            rad = S.nextFloat();
        }

        void setD() {
            diam = 2 * rad;
        }

        void setA() {
            area = 3.14F * rad * rad;
        }

        void SetC() {
            circum = 2 * 3.14F * rad;
        }
    }

    public static void main(String[] args) {

        Circle C = new Circle();
        C.setR();
        C.setA();
        C.setD();
        System.out.println(C.area);

    }
}
