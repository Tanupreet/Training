package com.tanu;

public class Abstraction {
	public static void main(String args[]){  
		Triangle tri=new Triangle();
		Rectangle rec=new Rectangle();
		
		Shape shape=tri;
		shape.width=10;
		shape.draw(); 
		System.out.println("\n");
	shape=rec;
		shape.length=10;
		shape.width=20;
rec.draw();
}
}