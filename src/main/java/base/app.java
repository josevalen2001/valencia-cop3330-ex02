package base;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.print("What is the input string? ");
        String input = newScan.nextLine();

        //Concat
        String output = input+" has "+input.length()+" characters.";

        //Output
        System.out.println(output);

    }

}


