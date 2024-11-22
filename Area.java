package Assignment5;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner a1 = new Scanner(System.in);
		//System.out.println("enter the value of PI");
		//double pi =a1.nextDouble();
		double a=3.14;
		System.out.println(a);
		System.out.println("enter the value of radius");
		double r=a1.nextDouble();
		double area=a*r*r;
		System.out.println("area of circle--"+ area);
		
		
		//Area of square
		System.out.println("height--");
		double b1= a1.nextDouble();
		double area1=b1*b1;
		System.out.println("area of square--"+area1);
		
		
		//Area of triangle
		double c=0.5;
		System.out.println(c);
		System.out.println("enter the value of base");
		double c1=a1.nextDouble();
		System.out.println("enter the value of height");
		double c2=a1.nextDouble();
		double area2=c*c1*c2;
		System.out.println("area of triangle--"+area2);
		

		//Area of rectangle
		System.out.println("enter the value of width");
		double d =a1.nextDouble();
		
		System.out.println("enter the value of lenght");
		double e =a1.nextDouble();
		double area3 =d*e;
		
		System.out.println("Area of rectangle--"+area3);
		
	}

}
