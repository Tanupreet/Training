package com.tanu;

class Custom{  
    
    static void validate(int age)throws InvalidAge{  
      if(age<18)  
       throw new InvalidAge("not valid");  
      else  
       System.out.println("welcome to vote");  
    }  
      
    public static void main(String args[]){  
       try{  
       validate(13);  
       }catch(Exception m){System.out.println("Exception occured: "+m);}  
   
       System.out.println("rest of the code...");  
   }  
 }  