import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, height;
        double areaCm, areaInch;

        System.out.print("Enter base in cm: ");
        base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        height = sc.nextDouble();

        areaCm = 0.5 * base * height;

        // Convert sq cm to sq inch
        areaInch = areaCm / 6.4516;

        System.out.println("The Area of the triangle in sq in is "
                + areaInch + " and sq cm is " + areaCm);

        sc.close();
    }
}