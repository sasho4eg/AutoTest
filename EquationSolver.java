/**
 * Created by Александр on 27.02.2017.
 */
public class EquationSolver {
    public static double solveEquation (double a, double b, double c ){
        double D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни квадратного уравнения: Х1 = " + x1 + ", Х2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: Х = " + x);
        }
        else {
            System.out.println("Уравнение не имеет корней!");
        }
        return 0;
    }
}
