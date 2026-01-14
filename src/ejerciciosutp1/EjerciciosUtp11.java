package ejerciciosutp1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjerciciosUtp11 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // (?i)   -> Ignora mayúsculas/minúsculas en todo el patrón
        // ^      -> Inicio
        // $      -> Fin
        Pattern patronSiNo = Pattern.compile("(?i)^(si|sí|no)$");

        String respuesta;
        boolean centinela = true;

        System.out.println("========================================");
        System.out.println("Programa solicitar un numero repetidamente entre 1 al 100");
        System.out.println("========================================");

        while (centinela) {
            System.out.print("Ingrese un numero: ");
            int numero = teclado.nextInt();
            boolean rangoValido = (numero > 0 && numero <= 100);

            if (rangoValido) {
                System.out.println("ingreso el numero: " + numero);
                
                // variable para while
                boolean verificarRespuesta = false;
                
                // bucle donde se repite la pregunta "Desea continuar Si/No" hasta que el usuario escriba la opcion correcta
                while(!verificarRespuesta){
                    System.out.println("Desea continuar Si/No");
                    respuesta = teclado.next();
                    Matcher evaluadorRespuesta = patronSiNo.matcher(respuesta);
                    boolean respuestaValido = evaluadorRespuesta.matches();

                    // Si el usuario escribe otra cosa diferente "Si/No" lanza mensaje de error
                    if (respuestaValido) {

                        verificarRespuesta = true; // Salimos del bucle de pregunta

                        /* si el usuario escribio "no" se termina el programa, caso contrario, 
                           el progama continua desde el inicio del bucle principal*/
                        if (respuesta.equalsIgnoreCase("no")) {
                            centinela = !respuestaValido;
                            System.out.println("Fin del programa.");
                        }

                    } else {
                        System.out.println("Error: No te entendí. Escribe Si o No.");
                    }
                
                }
                

            } else {
                System.out.println("numero no valido. Intente de nuevo");
            }

        }
        teclado.close();
    }
}
