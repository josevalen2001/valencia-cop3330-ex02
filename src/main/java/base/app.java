package base;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

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


