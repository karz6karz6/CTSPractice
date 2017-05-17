import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CreateFiles {

	
	public static void main(String[] args) throws IOException {

		Path p = Paths.get("mainfolder/folderfiles");
		Files.createDirectories(p);

//		FileOutputStream fo = new FileOutputStream("NewFile.txt");
//		DataOutputStream dos = new DataOutputStream(fo);
//		dos.writeChars("First Line");
//		JOptionPane.showMessageDialog(null, "Done");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("BWFile.txt"));
//		BufferedWriter bw = Files.newBufferedWriter("BWFile2.txt",CREATE,APPEND);
		String line1 = "First line with Buffered Writer";
		bw.flush();
		bw.write(line1,0,line1.length());
		bw.close();
		JOptionPane.showMessageDialog(null, "Write Done");
		
//		BufferedReader br = new BufferedReader(new FileReader("BWFile.txt"));
		Scanner sc = new Scanner(new FileReader("BWFile.txt")).useDelimiter(" ");
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
//		br.close();
		sc.close();
	}



}
