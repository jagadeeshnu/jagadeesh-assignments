import java.io.*;
import java.util.*;
public class ClientTest {

	public static void main(string[]args) {
		
		System.out.println("Main methid start..");
		Scanner scanner = new scanner(system.in);
		
		System.out.println("Enter Divinded number:");
		int dividend = scanner.nextInt();
		
		System.out.println("Enter Divisor number:");
		int divisor = scanner.nextInt();
		
		int result = dividend/divisor;
		
		System.out.println("result is:"+result);
		scanner.close();
		System.out.println("main method end..");
	}
}
