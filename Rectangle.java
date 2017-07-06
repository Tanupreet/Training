package com.tanu;

public class Rectangle extends Shape {
	
		

		void draw()
		{
			for(int i=1; i<width; i++)
			{
				System.out.print("");
				for(int j=1; j<length; j++)
				{
					System.out.print(" * ");
				}
				System.out.println("\n ");
			}
		
		}}
