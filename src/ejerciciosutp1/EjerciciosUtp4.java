package ejerciciosutp1;

import java.util.Scanner;

public class EjerciciosUtp4 {

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
    

        String nombre;
        char abreviaturaSexo;
        int seleccionProfresion;
        
        int salud = 1;
        int educacion= 2;
        int transporte = 3;
        
        // monto original "100% x porcentaje" de cada area
        float porcentajeSaludMujer =1.25f;
        float porcentajeEducaciónMujer =1.12f;
        float porcentajeTransporteMujer =1.20f;
        
        float porcentajeSaludHombre =1.20f;
        float porcentajeEducaciónHombre =1.11f;
        float porcentajeTransporteHombre =1.15f;
        
        // Salario Neto
        float salarioSalud = 15000f;
        float salarioEducacion = 12000f;
        float salarioTransporte = 18000f;
        
        // Aumento
        float aumentoSalud;
        float aumentoEducacion;
        float aumentoTransporte;
        
        System.out.println("Programa aumento de salario");
        System.out.println("------------------------------");
        
        System.out.print("Digite su nombre: ");
        nombre = teclado.next();
        
        System.out.println("Digite \"M\" Masculino o \"F\" Femenino  ");
        abreviaturaSexo = teclado.next().charAt(0);
        
        
        System.out.println("Seleccione su profesion");
        System.out.println("1 Salud \n2 Educacion \n3 Transporte");
        seleccionProfresion = teclado.nextInt();
                
        // para comparar un cararter con un char se usa comilla simple ''
        boolean confirmarSexo = (abreviaturaSexo == 'M') || (abreviaturaSexo == 'F');
                
        
        if (confirmarSexo) {
            
            if (seleccionProfresion == salud && abreviaturaSexo == 'M') {
                aumentoSalud = (salarioSalud * porcentajeSaludHombre); 
                System.out.println("usted gana " + salarioSalud);
                System.out.println("Su amumento es del 20%"); 
                System.out.print("sueldo final: " + aumentoSalud); 
                System.out.println("");
            }
            
            if (seleccionProfresion == salud && abreviaturaSexo == 'F') {
                 aumentoSalud = (salarioSalud * porcentajeSaludMujer); 
                 System.out.println("usted gana " + salarioSalud);
                 System.out.println("Su amumento es del 25%");
                 System.out.print("sueldo final: " + aumentoSalud); 
                 System.out.println("");
            }
                     
            if (seleccionProfresion == educacion && abreviaturaSexo == 'M') {
                aumentoEducacion = (salarioEducacion * porcentajeEducaciónHombre); 
                System.out.println("usted gana " + salarioEducacion);
                System.out.println("Su amumento es del 20%"); 
                System.out.print("sueldo final: " + aumentoEducacion); 
                System.out.println("");

            }
            
            if (seleccionProfresion == educacion && abreviaturaSexo == 'F') {
                aumentoEducacion = (salarioEducacion * porcentajeEducaciónMujer); 
                System.out.println("usted gana " + salarioEducacion);
                System.out.println("Su amumento es del 20%"); 
                System.out.print("sueldo final: " + aumentoEducacion); 
                System.out.println("");
            }
            
            if (seleccionProfresion == transporte && abreviaturaSexo == 'M') {
                aumentoTransporte = (salarioTransporte * porcentajeTransporteHombre); 
                System.out.println("usted gana " + salarioTransporte);
                System.out.println("Su amumento es del 20%"); 
                System.out.print("sueldo final: " + aumentoTransporte); 
                System.out.println("");

            }
            
            if (seleccionProfresion == transporte && abreviaturaSexo == 'F') {
                aumentoTransporte = (salarioTransporte * porcentajeTransporteMujer); 
                System.out.println("usted gana " + salarioTransporte);
                System.out.println("Su amumento es del 20%"); 
                System.out.print("sueldo final: " + aumentoTransporte);  
                System.out.println("");
            }    
        
        } else {
            System.out.println("Genero Inexistente");
        }
        
    }
    
}
