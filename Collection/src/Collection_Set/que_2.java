
package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;

public class que_2 {

	public static void main(String[] args) {
		HashSet<String> empNames = new HashSet<>();
		empNames.add("Ajay");
		empNames.add("Kumar");
		empNames.add("Madhu");
		
		Iterator<String> it = empNames.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
