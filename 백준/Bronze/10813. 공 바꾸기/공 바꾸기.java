import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n,m,i,j;
		int temp;
		
		n = scan.nextInt();
		m = scan.nextInt();
		
		int[] basket = new int[n];
		
		for (int b=0; b<n; b++) {
			basket[b] = b+1;
		}
		
		for (int c=0; c<m; c++) {
			i = scan.nextInt();
			j = scan.nextInt();
			
			temp = basket[i-1];
			basket[i-1] = basket[j-1];
			basket[j-1] = temp;
		}
		
		for (int k=0; k<basket.length; k++) {
			System.out.print(basket[k]+" ");
		}
	}

}
