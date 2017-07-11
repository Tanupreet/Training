package com.tanu;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaMap {
	public static void main(String args[]) {
		Person person = new Person("name ", 22, Gender.Male);
		Person person1 = new Person(" name1 ", 21, Gender.Female);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Person> people = Arrays.asList(person, person1);

		/*
		 * Map<Integer, Person> map = people.stream() .collect(
		 * Collectors.toMap( (Person p) -> p.getAge(), (Person p) -> p));
		 * map.entrySet() .forEach(System.out::println);
		 * 
		 * Map<String, Person> mapWithNameKey = people.stream() .collect(
		 * Collectors.toMap( (Person p) -> p.getName(), (Person p) -> p));
		 * mapWithNameKey.entrySet() .forEach(System.out::println);
		 */

		System.out.println(
				list.stream()
				.filter(v -> v > 3)
				.filter(v -> v %3==0)
				.reduce(0,(v, k) -> v=v+k));  // v+=k;

		System.out.println(
				people.stream()
				.map((Person v) -> v.getName()).reduce((v, k) -> v.concat(k)));

	}
}