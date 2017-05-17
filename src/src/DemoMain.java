import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class DemoMain {
	public static void main(String[] args) throws Exception {

		// FileOutputStream fs = new FileOutputStream("karthik.txt");
		// DataOutputStream ds = new DataOutputStream(fs);
		// ds.writeBytes("Karthik is a good boy!!!");

		FileInputStream fi = new FileInputStream("Data.txt");
		// DataInputStream di = new DataInputStream(fi);
		BufferedReader di = new BufferedReader(new InputStreamReader(fi));
		String data = di.readLine();
		System.out.println("Data read from file: " + data);
		Scanner sc = new Scanner(data).useDelimiter("/n");
		TreeSet<String> hs = new TreeSet<String>();
		TreeSet<String> ts = new TreeSet<String>();
		List<String> li = new ArrayList<String>();
	
		

		while (sc.hasNext()) {
			hs.add(sc.next());
		}
		
		

		ts.addAll(hs.subSet("Karthik", "Swetha"));
		hs.removeAll(ts);
		
		for (String S : hs) {
//			JOptionPane.showMessageDialog(null,"Completed");
			System.out.println(S);
		}
		sc.close();
	}
}
