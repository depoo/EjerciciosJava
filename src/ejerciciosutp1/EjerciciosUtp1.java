package ejerciciosutp1;

import java.util.Scanner;

public class EjerciciosUtp1 {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        // variables
        String nombre;
        int edad;
        int sexo;
        
        System.out.println("Programa Jubilacion");
        System.out.println("------------------------");
        
        System.out.println("Introduzca su nombre");
        nombre = teclado.nextLine();
        
        System.out.println("Introduzca su edad");
        edad = teclado.nextInt();
        
        System.out.println("Selecciona tu genero");
        System.out.println("1 Masculino\n2 Femenino");
        sexo = teclado.nextInt();
      
        // esta variable verifica la edad y sexo de la persona
        boolean confirmar = (edad >= 60 && sexo != 1) 
                            || (edad >= 65 && sexo == 1);
        
        
        if (confirmar) {
            System.out.println("----------------------------------------");
            System.out.println("nombre: "+ nombre + "\nedad: " + edad + "\nUd puede jubilarse");
        } else {
            System.out.println("Ud no puede jubilarse");
        }
    }
    
}
