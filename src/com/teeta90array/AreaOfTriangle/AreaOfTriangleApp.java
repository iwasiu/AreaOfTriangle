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
		
		System.out.println("(x1,y1):"+"("+x1+","+y1+") and "+ "(x2,y2):"+"("+x2+","+y2+")");
		side1 = findDistanceBtwPoint(x1, x2, y1, y2);
		System.out.println("side1: "+side1);

		System.out.println("(x1,y3):"+"("+x1+","+y1+") and "+ "(x3,y3):"+"("+x3+","+y3+")");
		side2 = findDistanceBtwPoint(x1, x3, y1, y3);
		System.out.println("side2: "+side2);
		
		System.out.println("(x2,y2):"+"("+x2+","+y2+") and "+ "(x3,y3):"+"("+x3+","+y3+")");
		side3 = findDistanceBtwPoint(x2, x3, y2, y3);
		System.out.println("side3: "+side3);
		
		//	check if the vertices form a triangle
		boolean isTiangle = isTriangle();
		
		//	check if triangle of those vertices exist
		if (isTiangle) {
			getArea();
		}else {
			System.out.println("Sorry, there's no such triangle");
			System.exit(1);
		}
		
	} // end of main method
	
	//	Method to find the distance between any two vertices
	private static double findDistanceBtwPoint(double point1Ordinate1, double point1Ordinate2, double point2Ordinate1, double point2Ordinate2) {
		double dist = Math.pow((point1Ordinate1 - point1Ordinate2), 2) + Math.pow((point2Ordinate1 - point2Ordinate2), 2);
		double sqrtDist = Math.pow(dist, 0.5);
		return sqrtDist;
	}
	
	//	method to check validity of lengths of the triangle
	private static boolean isTriangle() {
		return (side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1;
	}

	//	method to calculate area of the triangle 
	private static void getArea() {
		System.out.println("Side1:"+side1+"\nSide2:"+side2+"\nSide3:"+side3);
		double s = (side1 + side2 + side3) / 2;
		System.out.println("s:- "+s);
		double area = Math.pow((s * (s  - side1) * (s - side2) * (s - side3)),0.5);
		System.out.println("The area of the traingle is "+area);
	}

}
