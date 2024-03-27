import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] num = new int[10];
        
        int result = 0;
        
        for (int i=0; i<num.length; i++) {
        	num[i] = scan.nextInt();
        	num[i] = num[i] % 42;
        }
        
        for (int i=0; i<num.length; i++) {
        	int count = 0;
        	for (int j=i+1; j<num.length; j++) {
        		if(num[i] == num[j]) {
        			count++;
        		}
        	}
        	if (count == 0) {
        		result++;
        	}
        }
        System.out.print(result);
    }
}