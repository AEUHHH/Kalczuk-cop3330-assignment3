package ex42;
import java.util.*;
import java.io.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cody Kalczuk
 */

public class App1
{
    public void printDetails(String filename)
    {
        try
        {
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            while (sc.hasNext())
            {
                String s = sc.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error: File Not Found!!");
        }
    }
    public static void main(String[] args)
    {
        App1 emp = new App1();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");
        emp.printDetails("C:\\Users\\kalcz\\IdeaProjects\\Kalczuk-cop3330-assignment3\\src\\main\\java\\ex42\\exercise42_input.txt");
    }
}