import java.util.*;

public class Trigonometry {

    public static double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public static double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double angle = sc.nextDouble();

        System.out.println("Sine: "+ sine(angle));
        System.out.println("Coine: "+ cosine(angle));
    }
}