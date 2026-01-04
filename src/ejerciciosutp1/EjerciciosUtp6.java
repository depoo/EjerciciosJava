package ejerciciosutp1;

import java.util.Scanner;

public class EjerciciosUtp6 {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        String nombre;
        int puntuacion;
        
        System.out.println("Programa de puntuacion candidatos");
        System.out.println("-------------------------------------");
        
        System.out.printf("Nombre del Postulante: ");
        nombre = teclado.next();
        
        
        System.out.println("La puntuacion debe ser del 1 al 10");
        System.out.printf("Puntuacion del postulante? ");
        puntuacion = teclado.nextInt();
                
        switch(puntuacion){
            case 0, 1, 2, 3, 4:
                System.out.println("descartado");
                break;
            case 5:
                System.out.println("en suspenso");
                break;
            case 6:
                System.out.println("aceptable");
                break;
            case 7, 8:
                System.out.println("notable");
                break;
            case 9, 10:
                System.out.println("sobresaliente");
                break;
            default: System.out.println("Puntuacion no valida");
                
        }
    }
    
}
