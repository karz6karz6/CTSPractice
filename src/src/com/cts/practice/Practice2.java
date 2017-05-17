package com.cts.practice;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*Create an empty LinkedList<Integer>, Using a
Listlterator/for loop, add Integers to the List by always inserting them in the
middle of the List.*/

public class Practice2 {

	public static void main(String[] args) throws IOException {

		LinkedList<Integer> Llist = new LinkedList<Integer>();
		int Limit = Integer.parseInt(JOptionPane.showInputDialog(null, "How many elements to be inserted ?"));
		int index = 0;
		for (int a = 0; a < Limit; a++) {
			Llist.add(index, a);
			int FirstIndex = Llist.indexOf(Llist.getFirst());
			int LastIndex = Llist.indexOf(Llist.getLast());
			double Rem = (FirstIndex + LastIndex) % 2;
			int Mid = (FirstIndex + LastIndex) / 2;
			if (Rem > 0) {
				index = Mid + 1;
			} else {
				index = Mid;
			}
			if (index == 0) {
				index++;
			}
		}

		System.out.println("List of elements: " + Llist);

	}

}
