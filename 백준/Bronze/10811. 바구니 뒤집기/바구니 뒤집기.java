import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] baguni = new int[n];
        int temp = 0;
        
        for (int i=0; i<n; i++) {
        	baguni[i] = i+1;
        }
        
        for (int k=0; k<m; k++) {
        	int i = scan.nextInt();
        	int j = scan.nextInt();
        	
        	for (int a=i; a<j; a++) {
        		temp = baguni[i-1];
        		baguni[i-1] = baguni[j-1];
        		baguni[j-1] = temp;
        		i++;
        		j--;
        	}
        }
        
        for (int i=0; i<baguni.length; i++) {
        	System.out.print(baguni[i]+" ");
        }
    }
}