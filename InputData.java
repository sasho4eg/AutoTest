/**
 * Created by Александр on 28.02.2017.
 */
import java.util.Scanner;

public class InputData {
    public static double inputCoefficient (String text){
        System.out.print(text);
        boolean flag = true;
        double digit = 0;
        Scanner scn = new Scanner(System.in);
        while(flag){
            try{
                digit = scn.nextDouble();
                flag = false;
                break;
            }catch(Exception e){
                System.out.print(" Wrong!!!. Retype: ");
                scn.next();
            }
        }
        //System.out.println(digit);
        return digit;
    }
}
