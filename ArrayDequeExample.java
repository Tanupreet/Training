package com.tanu;

import java.util.*;  
public class ArrayDequeExample {  
   public static void main(String[] args) {  
   //Creating Deque and adding elements  
   Deque<String> deque = new ArrayDeque<String>();  
   deque.add("Ravi");    
   deque.add("Vijay");     
   deque.add("Ajay");
   
   //Traversing elements  
   for (String str : deque) {  
   System.out.println(str);  
   
   }  
   String value=deque.peek();
   System.out.println(deque);
   System.out.println(value);
   
   value=deque.poll();
   System.out.println(deque);
   System.out.println(value);
   
   value=deque.pop();
   System.out.println(deque);
   System.out.println(value);
   
   value=deque.poll();
   System.out.println(deque);
   System.out.println(value);
   
   deque.offer("value");
   System.out.println(value);
   
   deque.offerFirst("value1");
   System.out.println(deque);
   
   deque.offerLast("value2");
   System.out.println(deque);
   
   }  
}  