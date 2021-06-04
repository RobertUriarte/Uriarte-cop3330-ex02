/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        System.out.print("What is the input string? ");
        Scanner scan = new Scanner(System.in);
        String random_string = scan.nextLine();
        System.out.print(random_string +" has " + random_string.length() +" characters.");
    }
}
