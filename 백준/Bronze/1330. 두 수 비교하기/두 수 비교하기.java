import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int A; 
		int B;
		
		Scanner scann = new Scanner(System.in);
		
		A=scann.nextInt();
		B=scann.nextInt();
				
	
		if (A>B){
		    System.out.println(">");
		}
		else if (A<B) {
		    System.out.println("<");
		} 
		else if (A==B) {
		    System.out.println("==");
		}
	}

	}