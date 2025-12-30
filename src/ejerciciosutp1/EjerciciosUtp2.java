package ejerciciosutp1;

import java.util.Scanner;

public class EjerciciosUtp2 {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Verificacion de Devolucion de productos");
        System.out.println("Bienvenido - Muestre el producto");
        System.out.println("----------------------------------------------");
        
        int Lunes = 1;
        int Miercoles = 3;
        int Jueves = 4;
        
        System.out.println("Ingrese el dia de compra");
        System.out.println("1 Lunes \n2 Martes \n3 Miercoles \n4 Jueves \n5 Viernes \n6 Sabado \n7 Domingo");
        int dia = entrada.nextInt();
        
        System.out.println("Ingrese precio producto");
        double precio = entrada.nextDouble();
        
        //PARTE DE LOGICA MAL DESARROLLADO
        /*boolean verificarProducto = (dia != Miercoles && precio >= 50 && precio <= 80 
                                    && dia != Jueves && precio >= 50 && precio <= 80) ||
                                (dia != Lunes && precio >=120 && dia != Miercoles && precio >= 120
                                && dia != Jueves && precio >= 120) ;*/
        
        // COMPRENDER BIEN CONCEPTOS "OPERADORES CORTOCIRCUITO"
        boolean verificarProductos = (dia == Lunes && precio >= 50 && precio <= 80) ||
                                    (dia != Lunes && dia != Miercoles && dia != Jueves && precio >= 120);
        
        System.out.println("----------------------------");
        
        if (verificarProductos) {
            System.out.println("Dia: " + dia + "\nprecio: " + precio);
            System.out.println("---- Producto devuelto ----");
        } else {
            System.out.println("--- No se puede devolver el producto. Lo sentimos ---");
        }
    
    }
    
}
