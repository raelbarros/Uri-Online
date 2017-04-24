package uri_1071;
import java.util.Scanner;
public class URI_1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x, y, aux = 0;
        
        
        x = sc.nextInt();
        y = sc.nextInt();
        

        if (x < y){
            for( x = x+1; x < y; x++){
            
                if (x % 2 != 0)
                    aux += x;
            }
            
            System.out.println(aux);
        }
        
        else if (x > y){
            for( y = y+1; y < x; y++){
            
                if (y % 2 != 0)
                    aux +=y;
            }
            
            System.out.println(aux);
        }
     

    }
    
}
