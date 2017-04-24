package uri_1065;

import java.util.Scanner;

public class URI_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] vet = new int[5];
        int par = 0, impar = 0, positivo = 0, negativo = 0;
        
        for (int i =0; i < 5; i++)
            vet[i] = sc.nextInt();

        
        for (int i = 0; i < 5; i++){
            if(vet[i] % 2 == 0)
                par++; 
            
            if(vet[i] % 2 != 0)
                impar++;
            
            if (vet[i] > 0)
                positivo++;
            
            if (vet[i] < 0)
                negativo++;
        }
        
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
    
}
