package com.tanu;

public class Triangle extends Shape {
	 
		

		

		void draw()
		{
			for(int i=1; i<width; i++)
			{
				for(int j=0; j<i; j++)
				{
					System.out.print(" * ");
				}
				
				System.out.println();
		}
		}

		
		 
}
