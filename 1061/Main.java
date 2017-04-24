package pkg1061;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String string;
       int diaInicial, diaFinal, horaInicial, horaFinal;
       int minInicial, minFinal, segInicial,segFinal;
       int diaTotal = 0, horaTotal = 0, minTotal = 0, segTotal = 0;
       boolean boolHora = false, boolMin = false, boolSeg = false;
       
        string = sc.next();
        diaInicial = sc.nextInt();
        
        horaInicial = sc.nextInt();
        string = sc.next();
        minInicial = sc.nextInt();
        string = sc.next();
        segInicial = sc.nextInt();
        
        string = sc.next();
        diaFinal = sc.nextInt();
        
        horaFinal = sc.nextInt();
        string = sc.next();
        minFinal = sc.nextInt();
        string = sc.next();
        segFinal = sc.nextInt();
        
        
        if(horaInicial > horaFinal)
            boolHora = true;
        if(minInicial > minFinal)
            boolMin = true;
        if(segInicial > segFinal)
            boolSeg = true;

        while(diaInicial != diaFinal)  {
                diaTotal++;   diaInicial++;
        }

        while(horaInicial != horaFinal){
                horaTotal++;
                horaInicial++;
                if(horaInicial == 25)
                    horaInicial = 1;
        }

        while(minInicial != minFinal)  {
                minTotal++;
                minInicial++;
                if(minInicial == 61)
                    minInicial = 1;
                }

        while(segInicial != segFinal)  {
                segTotal++;
                segInicial++;
                if(segInicial == 61)
                    segInicial = 1;
                }

        if(boolHora == true)
            diaTotal--;
        if(boolMin == true)
            horaTotal--;
        if(boolSeg == true)
            minTotal--;
        
        System.out.print(diaTotal + " dia(s)\n");
        System.out.print(horaTotal + " hora(s)\n");
        System.out.print(minTotal + " minuto(s)\n");
        System.out.print(segTotal + " segundo(s)\n"); 
        
        
       
        
    }
    
}
