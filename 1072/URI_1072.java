package uri_1072;
import java.util.Scanner;
public class URI_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int in = 0, out = 0, x, n;
        
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            
            if(x >= 10 && x <= 20)
                in++;            
            
            else
                out++;      
        }
        
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
    
}
