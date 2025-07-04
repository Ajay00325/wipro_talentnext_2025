package java_fundamentals;
import java.util.*;
public class que_10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String color=s.nextLine();
		switch( color) {
		case "R":
			System.out.println("Red");
			break;
		case "B":
			System.out.println("Blue");
			break;
		case "G":
			System.out.println("Green");
			break;
		case "O":
			System.out.println("Orange");
			break;
		case "Y":
			System.out.println("Yellow");
			break;
		case "W":
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid code");
			
		}
		}

	}


