package base;
import java.util.*;

public class app {

    public static void main(String[] args) {
        Scanner  newScan = new Scanner(System.in);

        //Input
        Scanner in = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String input = in.nextLine();

        //Concat and output
        System.out.println(input+" has "+input.length()+" characters.");


    }

}


