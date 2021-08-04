package Eception_Demo;

import java.util.Scanner;

public class Division_Demo {

	public static void main(String[] args) {

        int a, b, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");
        a = input.nextInt();
        b = input.nextInt();

        try // statement to be monitored with throw exception
        {
            result=a/b;
            System.out.println(result);
        }catch (ArithmeticException e) // Exception thrown is handled in catch block
        {
            System.out.println("Divide by zero error: "+e.getMessage());
        }
        finally // clean-up operation
        {
            input.close();
            System.out.println("In finally block - Program execution ended");
        }

    }

	}
