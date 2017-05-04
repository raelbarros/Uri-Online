package uri_1073;
import java.util.Scanner;
public class URI_1073 {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
    
        int x;
        
        x = sc.nextInt();
        
        for (int i = 1; i < x; i++){
            i++;
            System.out.println(i+"^2 = "+ (i*i));
        }
    }
    
}
