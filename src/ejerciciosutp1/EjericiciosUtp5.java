package ejerciciosutp1;

import java.util.Scanner;

public class EjericiciosUtp5 {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int hora;
        int minuto;
        int segundo;        
        
        System.out.println("Reloj - Calcula el segundo siguiente");
        System.out.println("-------------------");
        
        System.out.print("introduzca la Hora actual 00 - 23: ");
        hora = teclado.nextInt();
        
        System.out.print("introduzca el minuto actual 00 - 59: ");
        minuto = teclado.nextInt();

        System.out.print("introduzca el segundo actual 00 - 59 : ");
        segundo = teclado.nextInt();
        
        
        
        boolean confirmaHora =  (hora>=00 && hora <=23) && (minuto>=00 && minuto <=59) && 
                                (segundo>=00 && segundo <=59);
        
        if (confirmaHora) {                    
            
            segundo++;
            if (segundo != 60) {              
                System.out.println("la Hora despues es: " + hora + ":" + minuto + ":" + segundo);
            }
            
            if (segundo == 60) {
                segundo = 0;
                minuto++;
                
                if (minuto != 60) {              
                    System.out.println("la Hora despues es: " + hora + ":" + minuto + ":" + segundo);
                }
                
                if (minuto == 60) {
                    minuto = 0;
                    hora++;

                    if (hora != 24) {              
                        System.out.println("la Hora despues es: " + hora + ":" + minuto + ":" + segundo);

                    }
                    
                    if (hora == 24) {
                        hora =0;
                        System.out.println("la hora despues es: " + hora + ":" + minuto + ":" + segundo);
                    }
                }
                
            }


        } else {
            System.out.println("Hora inexistente");
        }
        
        
    }
    
}
