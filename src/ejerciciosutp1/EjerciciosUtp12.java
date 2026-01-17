package ejerciciosutp1;

import java.util.Scanner;

public class EjerciciosUtp12 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        // 1. VARIABLES
        double sumaNotas = 0;
        int aprobados = 0;
        int desaprobados = 0;
        int totalAlumnos = 0;

        boolean centinela = true;

        System.out.println("=== SISTEMA DE GESTIÓN DE NOTAS UTP ===");
        System.out.println("Instrucciones: Ingrese las notas (0-20).");
        System.out.println("Nota: Escriba -1 para finalizar inmediatamente.\n");

        while (centinela) {

            System.out.println("Ingrese nota del estudiante #" + (totalAlumnos+1) + ": ");
            double nota = teclado.nextDouble();

            if (nota == -1) {
                centinela = false; // Apagamos el interruptor
                // Usamos 'break' para salir del while AHORA MISMO y no procesar esta nota
                break;
            }

            if (nota >= 0 && nota <= 20) {

                // A. ACUMULAMOS (Para el promedio)
                sumaNotas += nota; // sumaNotas = sumaNotas + nota
                totalAlumnos++;    // Contamos un alumno más

                // B. CLASIFICAMOS (Aprobado vs Desaprobado)
                // En Perú/UTP se aprueba con 10.5 (redondeado es 11)
                if (nota >= 10.5) {
                    aprobados++;
                } else {
                    desaprobados++;
                }
                
                
                System.out.print("¿Desea ingresar otra nota? (1=Si / 0=No): ");
                int respuesta = teclado.nextInt();
                
                if (respuesta == 0) {
                    centinela = false;
                }

            } else {
                System.out.println("Error: La nota debe estar entre 0 y 20.");
            } 
        }

        System.out.println("\n=== RESULTADOS FINALES ===");
        
        if (totalAlumnos > 0) {
            double promedio = sumaNotas / totalAlumnos;
            
            System.out.println("Total de alumnos evaluados: " + totalAlumnos);
            System.out.printf("Promedio Global: %.2f%n", promedio); // %.2f formatea a 2 decimales
            System.out.println("Aprobados: " + aprobados);
            System.out.println("Desaprobados: " + desaprobados);
        } else {
            System.out.println("No se ingresaron notas. No hay datos para mostrar.");
        }
        
    }
}