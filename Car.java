package com.tanu;

public class Car {
private String Color;
private String company;
private String model;


Car(String c, String com, String m) {
this.Color=c;
this.company=com;
	this.model=m;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}


public String getColor() {
	return Color;
}

public void setColor(String color) {
	Color = color;
}

public boolean equals(Object arg0)
{
	Car c1=(Car)arg0;
	return this.model.equals(c1.model) && this.Color.equals(c1.Color) && this.company.equals(c1.company);
}

public char[] compareTo(Car c2) {
	// TODO Auto-generated method stub
	return null;
}


}
