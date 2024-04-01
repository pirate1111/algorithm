import java.util.Scanner;
import java.util.HashSet;

//중복값을 저장하지 않는 HashSet 사용
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> result = new HashSet<Integer>();
        
        for (int i=0; i<10; i++) {
            result.add(scan.nextInt() % 42);
        }
        
        System.out.println(result.size());
    }
}
