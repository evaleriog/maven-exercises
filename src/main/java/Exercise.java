import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Exercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something:");
        String response = sc.nextLine();
        String isNumeric;
        System.out.println("You Entered: " + response);
        if(StringUtils.isNumeric(response) == false){
            isNumeric = "is not";
        }else{
            isNumeric = "is";
        }

        System.out.println("\"" + response + "\" " + isNumeric + " a number.");
        System.out.println("Flipped case: " + StringUtils.swapCase(response));
        System.out.println("Reversed: " + StringUtils.reverse(response));
    }
}
