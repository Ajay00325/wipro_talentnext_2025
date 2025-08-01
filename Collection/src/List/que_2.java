package List;
import java.util.ArrayList;
import java.util.Iterator;
public class que_2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Ajay");
		list.add("Balu");
		list.add("Yah");
		list.add("bharani");
		list.add("goutham");
		printAll(list);
	}
	
	static void printAll(ArrayList<String> names) {
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		
	}
}