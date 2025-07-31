package option_class;

import java.util.*;

public class que_20 {
	public static void main(String[] args) {
		String[] names = new String[5];
		Optional<String> opt = Optional.ofNullable(names[0]);
		if (opt.isPresent()) {
			System.out.println(names[0].length());
		} else {
			System.out.println("The string is empty");
		}

	}

}
