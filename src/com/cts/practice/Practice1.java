package com.cts.practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) throws IOException {

		try {
		Map<String, ArrayList<Integer>> maplist = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		ArrayList<String> arraystr = new ArrayList<String>();

		 Path p = Paths.get("Practice1/files/");
		 Files.createDirectories(p);
		 File f = new File("Practice1/files/Data.txt");

		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.flush();
		bw.write("First line content");
		bw.close();

//		JOptionPane.showMessageDialog(null, "Done");
		
		Scanner sc = new Scanner(new FileReader(f)).useDelimiter(" ");
		
		while(sc.hasNext()){
			arraystr.add(sc.next());	
		}
		
		arraystr.sort(null);
		
	for(int i=0;i<arraystr.size();i++){
		
		arraylist.add(arraystr.get(i).length());
		System.out.println(arraystr.get(i)+" "+arraylist.get(i));
	}	
	
	for(int k=0;k<arraystr.size();k++){
		
		maplist.put(arraystr.get(k), arraylist);
	}
	
	
	
		for(Map.Entry m : maplist.entrySet()){
			
			System.out.println(m.getKey() + " " + m.getValue());
		}
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
		

		
	}

}
