package helloworld;

import java.util.Scanner;

public class Hello {
//This code works fine
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter temperature: ");
		Scanner input1 = new Scanner(System.in);
		float temp = input1.nextFloat();
		
		
		
				if(temp <= 20)
					System.out.println("Its normal temperatutre");
				else
						System.out.print("its very hot");
				
	}	
}
