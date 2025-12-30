
package ejerciciosutp1;

import java.util.Scanner;

public class EjerciciosUtp3 {

    static Scanner entrada = new Scanner(System.in);
   
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        
        System.out.println("Progresion aritmetica App");
        System.out.println("------------------------------");
        System.out.println("Inserte 3 digitos");
        
        System.out.print("Primer digito: ");
        n1 = entrada.nextInt();
        System.out.print("Segundo digito: ");
        n2 = entrada.nextInt();
        System.out.print("Tercer digito: ");
        n3 = entrada.nextInt();
        
        int resultado1 = n3-n2;
        int resultado2 = n2-n1;
        
        // VERIFICA SI EL RESULTADO DE CADA RESTA ES IGUAL
        boolean verficacion = (resultado1 == resultado2);
        
        System.out.println("----- RESULTADO -----");
        
        if (verficacion) {
            System.out.println("--- Si es una progresion ---");
        } else {
            System.out.println("--- No es una progresion ---");
        }
        
        
    }
    
}
