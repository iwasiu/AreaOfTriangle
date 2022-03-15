package com.teeta90array.AreaOfTriangle;

import java.util.Scanner;

/*Write a program that prompts the user to enter three points, (x1, y1) , (x2, y2) , 
  and (x3, y3) , of a triangle then displays its area.
*/

public class AreaOfTriangleApp {
	
	//	attributes for co-ordinates of the vertices
	private static double x1,x2,x3,y1,y2,y3;
	
	//	sides of the triangle
	private static double side1,side2,side3;
	
	public static void main(String[] args) {
		
		// create a scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coordinates of the three points:(e.g.: x1 x2 x3 y1 y2 y3) ");
		x1 = input.nextDouble();
		x2 = input.nextDouble();
		x3 = input.nextDouble();
		y1 = input.nextDouble();
		y2 = input.nextDouble();
		y3 = input.nextDouble();
		
		//	close scanner object
		input.close();
		
		
	}

}
