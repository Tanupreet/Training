package com.tanu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class LambdaSimple {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//int resu=0;
		/*for(int i=0;i<list.size() && i%2==0;i++)
		{
			resu +=i;
		}*/
		/*
		 * list.forEach(new Consumer<Integer>(){ public void accept(Integer t){
		 * System.out.println(t); });
		 */

		/*
		 * list.forEach(LambdaSimple::printWithHello); // lambda expression
		 * 
		 * // list.forEach(String::valueOf); }
		 */

		/*
		 * public static void printWithHello(int a) { try{ Thread.sleep(100);
		 * }catch(InterruptedException e){ e.printStackTrace(); }
		 * System.out.println("Hello" + a);
		 */
	//	List<String> strlist = new ArrayList<String>();
	//	for(int i=0;i<list.size(); i+=2)
	//	{
	//		strlist.add("" +i*2);
	//		resu.toString();
	System.out.println(	
		list.stream()
			.filter(value-> value %2 == 0)
			.filter(value-> value>3)
			.mapToDouble(value->value *1.5)
			.sum()
		);
	}
	/*	}
		System.out.println(resu);
		list.stream()
			.map(String::valueOf)
			.forEach(System.out::println);
	}
*/
	public static void printWithHello(int a) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println("Hello" + a);
	}
}