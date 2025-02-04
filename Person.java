package com.tanu;

public class Person {
String name;
int age;
int id;
 Gender gender;
Person(String name, int age, Gender gender)
{
	
	this.name=name;
	this.age=age;
//	this.id=id;
	this.gender=gender;
}


public Gender getGender() {
	return gender;
}


public void setGender(Gender gender) {
	this.gender = gender;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}



public int hashCode()
{
	final int prime=31;
	int result=1;
	result=prime*result+age;
	result=prime*result +((name==null)?0 :name.hashCode());
	return result;
}

public boolean equals(Object obj)
{
	if(this==obj)
		return true;
	if(obj==null)
		return false;
	if(getClass()!= obj.getClass())
		return false;
	Person other=(Person)obj;
	if(age!=other.age)
		return false;
	if(name==null){
		if(other.name!=null)
			return false;
	}
	else if(!name.equals(other.name))
		return false;
	return true;
	}


@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
}





}

