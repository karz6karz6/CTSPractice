package com.cts.practice;

import java.util.ArrayList;
import java.util.Arrays;


/*Create a class, then make an initialized array of objects of your
class. Fill a List from your array. Create a subset of your List by using subList(
), then remove this subset from your List.*/

public class Practice3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		ArrayList<Integer> Sublist = new ArrayList<>();
		Sublist.addAll(list.subList(2, 5)); // Index values
		System.out.println("List before delete: " + list);
		System.out.println("Sub list :" + Sublist);
		list.removeAll(Sublist); // index values
		System.out.println("List after delete: " + list);

	}

}
