package ejerciciosutp1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjerciciosUtp10 {
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean centinela = true;
        
        System.out.println("-----------------------------------------------");
        System.out.println("Programa de verificar Codigo Universitario");
        System.out.println("-----------------------------------------------");
        
        Pattern patronCodigo = Pattern.compile("^[uU][0-9]{8}$");
        
        while(centinela){
            System.out.print("Ingrese su codigo: ");
            String codigo = teclado.next();
            
            Matcher evaluarCodigo = patronCodigo.matcher(codigo);
            boolean verificarCodigo = evaluarCodigo.matches(); // matches() solo devuelve True o False
            String mensajeFinal = (verificarCodigo) ? "Codigo correcto" : "Codigo incorrecto";
            System.out.println(mensajeFinal);
            centinela = !verificarCodigo;
            // Si verificarCodigo es (true), el signo de "!" lo invierte entonces -> centinela será false.
            // Si verificarCodigo es (false), el signo de "!" lo invierte entonces -> centinela será True.
            /* 
                la idea es que centinela se vuelva "false" cuando el codigo ingresado sea correcto.
                Cuando el codigo ingresado sea incorrecto, centinela seguira siendo "true" 
                tal caso que el bucle no terminara hasta que el codigo sea correcto
            */
        }
    }
    
}
