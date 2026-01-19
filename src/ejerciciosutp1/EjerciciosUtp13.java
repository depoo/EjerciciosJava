package ejerciciosutp1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EjerciciosUtp13 {
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        String passwordNoValido = "P@55w0rd";
        String correo;
        String password;
        
        int intentosMaximos = 5;
        int contador        = 0;
        
        System.out.println("==========");
        System.out.println("Login");
        
        boolean centinela = false;
            
        System.out.println("Usted tiene un maximo de "+ intentosMaximos + " intentos");
        
        while(!centinela && contador < intentosMaximos){          
            System.out.print("Correo electronico: ");
            correo = teclado.next();

            System.out.print("Password: ");
            password = teclado.next();

            contador++;
            Pattern patronCorreo = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
            Matcher validarPatron = patronCorreo.matcher(correo);
            boolean correoValido = validarPatron.matches();          
            
            if (correoValido && !password.equalsIgnoreCase(passwordNoValido)) {
                
                centinela = true;

            } else {
                System.out.println("Incorrecto. Le quedan " + (intentosMaximos - contador) + " intentos");
            }       
        }
        
        if (centinela) {
            System.out.println("Bienvenido al sistema");
        } else {
            System.out.println("Su cuenta a sido suspendida");
        }
        
    }
    
}
