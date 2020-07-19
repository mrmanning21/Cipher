//Importing utilities.
import java.util.Random;
import java.util.Scanner;

public class Cipher {
	
    /*-------------------------------------------
   			Programming Fundamentals, CPSC-50100
			NAME: Michael Ryan Manning
			PROGRAMMING ASSIGNMENT 1
    *-------------------------------------------*/

	public static void main(String[] args) {
		
		//Bring in input utilities.
		Random gen = new Random();

		Scanner scn = new Scanner(System.in);
		
		//declare all integers involved.
        int x, plainText = 0, codeNumb = 0, randKey = 0, cipher = 0;

        //Laying the foundation for the query to the user.
		System.out.println("Welcome to the Cipher program.\n Please enter 5 numbers between 0 and 19.");
		
        System.out.println("1st number: ");
        	x = scn.nextInt();
        	
        	if(x < 0 || x > 19) {
			
			System.out.println("I'm sorry. That number is not within the parameters specified. Goodbye.");
            System.exit(0);
        						}
        	plainText = plainText + x;

        System.out.println("2nd number: ");
        	x = scn.nextInt();
        	
        	if(x < 0 || x > 19) {
			
			System.out.println("I'm sorry. That number is not within the parameters specified. Goodbye.");
            System.exit(0);
        						}
        	plainText = plainText + x;

        System.out.println("3rd number: ");
        	x = scn.nextInt();
        	
        	if(x < 0 || x > 19) {
			
			System.out.println("I'm sorry. That number is not within the parameters specified. Goodbye.");
            System.exit(0);
        						}
        	plainText = plainText + x;

        System.out.println("4th number: ");
        	x = scn.nextInt();
        	
        	if(x < 0 || x > 19) {
			
			System.out.println("I'm sorry. That number is not within the parameters specified. Goodbye.");
            System.exit(0);
        						}
        	plainText = plainText + x;

        System.out.println("5th number: ");
        	x = scn.nextInt();
        	if(x < 0 || x > 19) {
			
			System.out.println("I'm sorry. That number is not within the parameters specified. Goodbye.");
            System.exit(0);
        						}
        	plainText = plainText + x;
        	
        	
		//Total out the inputs.
        System.out.println("The total is: "+plainText);

        //Randomize an integer 0-9.
        randKey = gen.nextInt(10);
        System.out.println("Your random key is "+randKey);
        
        
        //The conditional statement to calculate the encoding.
        if (plainText != 0)
        { 
            codeNumb = (plainText - (plainText % 10)) / 10;
            plainText = plainText - codeNumb * 10;
            cipher = (cipher + (codeNumb + randKey) % 10) * 10;
            cipher = cipher + (plainText + randKey) % 10;

            System.out.println("Your encoded number is "+cipher);
        }
        
	}

}