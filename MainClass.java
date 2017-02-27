/**
 * Created by Александр on 27.02.2017.
 */
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите коефициенты а,в,с квадратного уравнения: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        System.out.println(EquationSolver.solveEquation(a, b, c));
    }
}
