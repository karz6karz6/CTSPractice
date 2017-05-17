import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ArrayListDemo {
	

	public static void main(String[] args)  {
		
		List<String> li = new ArrayList<String>();
		
		String[] str = new String[] {"k","a","r"};
		
		li.toArray(str);
		
		for(String i : li)
		{
			JOptionPane.showMessageDialog(null, i);
		}
		
	}
}
