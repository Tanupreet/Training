package com.tanu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "@findEmployeeByName",  
	        query = "from Employee e where e.firstName = :firstName"  
	        )  
	    }  
	)  
@Entity
public class Employee {  
	@Id
private int id;  
private String firstName,lastName;  
  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getFirstName() {  
    return firstName;  
}  
public void setFirstName(String firstName) {  
    this.firstName = firstName;  
}  
public String getLastName() {  
    return lastName;  
}  
public void setLastName(String lastName) {  
    this.lastName = lastName;  
}
@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}  
  
  
}  