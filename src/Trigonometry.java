import java.util.Scanner;

public class Trigonometry {

    public static double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public static double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();

        System.out.printf("Sine: %.1f%n", sine(angle));
        System.out.printf("Cosine: %.1f%n", cosine(angle));
    }
}
