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
        Pattern patronSiNo = Pattern.compile("(?i)^(si|no)$");

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

                System.out.println("Desea continuar");
                respuesta = teclado.next();
                Matcher evaluadorRespuesta = patronSiNo.matcher(respuesta);
                boolean respuestaValido = evaluadorRespuesta.matches();

                if (respuestaValido) {
                    if (respuesta.equalsIgnoreCase("no")) {
                        centinela = !respuestaValido;
                    }
                    
                } else {
                    System.out.println("Error: No te entendí. Escribe Si o No.");
                }

            } else {
                System.out.println("numero no valido");
            }

        }
        teclado.close();
    }
}
