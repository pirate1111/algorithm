import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] students = new int[30];
        
        for (int i=0; i<28; i++) {
        	int test = scan.nextInt();
        	students[test-1] = 1;
        }

        for (int i=0; i<students.length; i++) {
        	if (students[i] != 1) {
        		System.out.println(i+1);
        	}
        }
    }
}