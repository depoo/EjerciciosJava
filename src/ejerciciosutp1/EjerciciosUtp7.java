
package ejerciciosutp1;

import java.util.Scanner;


public class EjerciciosUtp7 {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        float ingresarDinero;
        float dolar = 3.82f;
        float euro = 4.17f;
        float conversionMoneda;
        float resultado = 0;
        
        System.out.print("Seleccione una opcion \n1 dolares-euros \n2 dolares-soles \n3 euros-dolares \n4 euros-soles \n5 soles-dolares \n6 soles-euros");
        int opcion = teclado.nextInt();
        
        switch(opcion){
            case 1: 
                System.out.println("Convirtiendo dolares a euros");
                ingresarDinero= teclado.nextFloat();
                // primero convertimos a soles
                conversionMoneda = ingresarDinero * dolar;
                // segundo convertimos a euros
                resultado = conversionMoneda / euro;
                System.out.println("recibes: "+ resultado + " euros");
                break;
            case 2:
                System.out.println("Convirtiendo dolares a soles");
                ingresarDinero= teclado.nextFloat();
                conversionMoneda = ingresarDinero * dolar;
                System.out.println("recibes: "+ conversionMoneda+ " soles");
                break;
            case 3:
                System.out.println("Convirtiendo Euros a dolares");
                ingresarDinero= teclado.nextFloat();
                // primero convertimos a soles
                conversionMoneda = ingresarDinero * euro;
                // segundo convertimos a dolares
                resultado = conversionMoneda / dolar;
                System.out.println("recibes: "+ resultado + " dolares");
                break;
            case 4:
                System.out.println("Convirtiendo Euros a soles");
                ingresarDinero= teclado.nextFloat();
                conversionMoneda = ingresarDinero * euro;
                System.out.println("recibes: "+ conversionMoneda+ " soles");
                break;
            case 5:
                System.out.println("Convirtiendo soles a dolares");
                ingresarDinero= teclado.nextFloat();
                conversionMoneda = ingresarDinero / dolar;
                System.out.println("recibes: "+ conversionMoneda + " dolares");
                break;
            case 6:
                System.out.println("Convirtiendo soles a Euros");
                ingresarDinero= teclado.nextFloat();
                conversionMoneda = ingresarDinero / euro;
                System.out.println("recibes: "+ conversionMoneda+ " euros");
                break;
            default:
                System.out.println("Opcion no valida");
        }
        
        
    }
    
}
