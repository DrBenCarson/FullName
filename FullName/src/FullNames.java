import java.io.*;
import java.util.*;
public class FullNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nameReader=new Scanner(System.in);
		System.out.println("What is your first name? ");
		String first=nameReader.nextLine();
		
		Scanner namesReader=new Scanner(System.in);
		System.out.println("What is your last name? ");
		String last=nameReader.nextLine();
		
		System.out.println("Your full name is " + first + " " + last + ".");
	}

}
