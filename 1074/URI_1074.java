package uri_1074;
import java.util.Scanner;
public class URI_1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x, n;
        
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            
            if (x > 0){
                if (x % 2 != 0)
                    System.out.println("ODD POSITIVE");
                
                else
                    System.out.println("EVEN POSITIVE");
            }
            
            else if(x < 0){
                if (x % 2 != 0)
                    System.out.println("ODD NEGATIVE");
                
                else
                    System.out.println("EVEN NEGATIVE");
            }
            
            else
                System.out.println("NULL");
        }
        
        
    }
    
}
