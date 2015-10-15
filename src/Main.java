import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    private static final String invalidInputString = "Invalid input, please try again.";
    static boolean running = true;
    private static String introductionString = "Hi there! Create a triangle by inserting three Integers, separated with an enter."
            + "\nPlease insert three Integers a, b and c "
            + "which might create a triangle. ";
    private static String rangeIntroString = "\nInsert the (positive) Integers:";

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println(introductionString);
        Scanner in = new Scanner(System.in);
        Triangle triangle = new Triangle();
        do {
            System.out.println(rangeIntroString);
            try {
                triangle.setA(in.nextInt());
                triangle.setB(in.nextInt());
                triangle.setC(in.nextInt());
                if (triangle.isWithinLimits(triangle.getA())
                        && triangle.isWithinLimits(triangle.getB())
                        && triangle.isWithinLimits(triangle.getC())) {
                    triangle.checkTriangleType(triangle);
                } else {
                    System.out.println(invalidInputString);
                }
            } catch (InputMismatchException ime) {
                in.nextLine();
            } catch (NoSuchElementException e) {
            }

        } while (running);

    }

}
