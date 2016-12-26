package com.loner.jdknew;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStreamTest {

	public static void main(String[] args) {
		List<Person> people = createPeople();
		Stream<Person> stream = people.stream();
		stream.forEach(p -> System.out.println(p.toString()));
	}

	static List<Person> createPeople() {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("王菲", Person.Sex.FEMALE, 39, 170.79));
		people.add(new Person("谢霆锋", Person.Sex.MALE, 35, 175.72));
		people.add(new Person("张柏芝", Person.Sex.FEMALE, 39, 168.56));
		return people;
	}
}
