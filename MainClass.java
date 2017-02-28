import java.util.Scanner;

/**
 * Created by Александр on 27.02.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        double cA = InputData.inputCoefficient("Enter coefficient A of sqr equation: ");
        double cB = InputData.inputCoefficient("Enter coefficient B of sqr equation: ");
        double cC = InputData.inputCoefficient("Enter coefficient C of sqr equation: ");

        System.out.println(EquationSolver.solveEquation(cA, cB, cC));
    }
}
