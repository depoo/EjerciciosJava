package ejerciciosutp1;

import java.util.Scanner;

public class EjerciciosUtp8 {
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Programa de calificacion alumnos");
        System.out.println("===================================");
        
        String mencion = "Deficiente";
        
        System.out.println("Introduzca la nota del alumno: ");
        int nota = teclado.nextInt();
        
       String resultado = switch(nota){
            case 19, 20 -> (nota > 18 && nota <=20) ? mencion.replace("Deficiente", "Excelente") : mencion;
            case 16, 17, 18 -> (nota > 15 && nota <=18) ? mencion.replace("Deficiente", "Bueno") : mencion;
            case 13, 14, 15 -> (nota >= 13 && nota <=15) ? mencion.replace("Deficiente", "Regular") : mencion;
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> (nota > 0 && nota < 13) ? mencion : "";
            default -> "nota no valida";
        };
                       
        System.out.println(resultado);
    }
    
}
