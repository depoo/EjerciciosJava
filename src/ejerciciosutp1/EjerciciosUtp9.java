package ejerciciosutp1;

import java.util.Scanner;

public class EjerciciosUtp9 {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        StringBuilder concatenador = new StringBuilder();
        
        System.out.println("Programa conversor a numeros romanos");
        System.out.println("------------------------------------------");
        // variable a ingresar
        System.out.println("Ingrese un numero del rango 1 - 50");      
        int ingresaNumero = teclado.nextInt();
        
        // numeros romanos
        String uno = "i";
        String dos = "ii";
        String tres = "iii";
        String cuatro = "iv";
        String cinco = "v";
        String seis = "vi";
        String siete = "vii";
        String ocho = "viii";
        String nueve = "ix";
        String diez = "x";
        String veinte = "xx";
        String treinta = "xxx";
        String cuarenta = "xl";
        String cincuenta = "l";
        
        String resultado = switch(ingresaNumero){
            case 1 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? uno.toUpperCase() : uno.toLowerCase();
                yield mensaje;
            }
            case 2 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? dos.toUpperCase() : dos.toLowerCase();
                yield mensaje;
            }
            case 3 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? tres.toUpperCase() : tres.toLowerCase();
                yield mensaje;
            }
            case 4 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? cuatro.toUpperCase() : cuatro.toLowerCase();
                yield mensaje;
            }
            case 5 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? cinco.toUpperCase() : cinco.toLowerCase();
                yield mensaje;
            }
            case 6 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? seis.toUpperCase() : seis.toLowerCase();
                yield mensaje;
            }
            case 7 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? siete.toUpperCase() : siete.toLowerCase();
                yield mensaje;
            }
            case 8 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? ocho.toUpperCase() : ocho.toLowerCase();
                yield mensaje;
            }
            case 9 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? nueve.toUpperCase() : nueve.toLowerCase();
                yield mensaje;
            }
            case 10 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? diez.toUpperCase() : diez.toLowerCase();
                yield mensaje;
            }
            case 11 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(diez).append(uno).toString().toUpperCase() 
                                                                    : concatenador.append(diez).append(uno).toString().toLowerCase();
                yield mensaje;
            }
            case 12 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(uno).append(dos).toString().toUpperCase() 
                                                                    : concatenador.append(diez).append(dos).toString().toLowerCase();
                yield mensaje;
            }
            case 13 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(diez).append(tres).toString().toUpperCase() 
                                                                    : concatenador.append(diez).append(tres).toString().toLowerCase();
                yield mensaje;
            }
            case 14 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(diez).append(cuatro).toString().toUpperCase() 
                                                                    : concatenador.append(diez).append(cuatro).toString().toLowerCase();
                yield mensaje;
            }
            case 15 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(diez).append(cinco).toString().toUpperCase() 
                                                                    : concatenador.append(diez).append(cinco).toString().toLowerCase();
                yield mensaje;
            }
            case 16 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(diez).append(seis).toString().toUpperCase() 
                                                                    : concatenador.append(diez).append(seis).toString().toLowerCase();
                yield mensaje;
            }
            case 17 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(diez).append(siete).toString().toUpperCase() 
                                                                    : concatenador.append(diez).append(siete).toString().toLowerCase();
                yield mensaje;
            }
            case 18 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(diez).append(ocho).toString().toUpperCase() 
                                                                    : concatenador.append(diez).append(ocho).toString().toLowerCase();
                yield mensaje;
            }
            case 19 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(diez).append(nueve).toString().toUpperCase() 
                                                                    : concatenador.append(diez).append(nueve).toString().toLowerCase();
                yield mensaje;
            }
            case 20 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(veinte).toString().toUpperCase() 
                                                                    : concatenador.append(veinte).toString().toLowerCase();
                yield mensaje;
            }
            case 21 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(veinte).append(uno).toString().toUpperCase() 
                                                                    : concatenador.append(veinte).append(uno).toString().toLowerCase();
                yield mensaje;
            }
            case 22 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(veinte).append(dos).toString().toUpperCase() 
                                                                    : concatenador.append(veinte).append(dos).toString().toLowerCase();
                yield mensaje;
            }
            case 23 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(veinte).append(tres).toString().toUpperCase() 
                                                                    : concatenador.append(veinte).append(tres).toString().toLowerCase();
                yield mensaje;
            }
            case 24 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(veinte).append(cuatro).toString().toUpperCase() 
                                                                    : concatenador.append(veinte).append(cuatro).toString().toLowerCase();
                yield mensaje;
            }
            case 25 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(veinte).append(cinco).toString().toUpperCase() 
                                                                    : concatenador.append(veinte).append(cinco).toString().toLowerCase();
                yield mensaje;
            }
            case 26 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(veinte).append(seis).toString().toUpperCase() 
                                                                    : concatenador.append(veinte).append(seis).toString().toLowerCase();
                yield mensaje;
            }
            case 27 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(veinte).append(siete).toString().toUpperCase() 
                                                                    : concatenador.append(veinte).append(siete).toString().toLowerCase();
                yield mensaje;
            }
            case 28 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(uno).append(ocho).toString().toUpperCase() 
                                                                    : concatenador.append(uno).append(ocho).toString().toLowerCase();
                yield mensaje;
            }
            case 29 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(veinte).append(nueve).toString().toUpperCase() 
                                                                    : concatenador.append(veinte).append(nueve).toString().toLowerCase();
                yield mensaje;
            }
            case 30 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(treinta).toString().toUpperCase() 
                                                                    : concatenador.append(treinta).toString().toLowerCase();
                yield mensaje;
            }
            case 31 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(treinta).append(uno).toString().toUpperCase() 
                                                                    : concatenador.append(treinta).append(uno).toString().toLowerCase();
                yield mensaje;
            }
            case 32 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(treinta).append(dos).toString().toUpperCase() 
                                                                    : concatenador.append(treinta).append(dos).toString().toLowerCase();
                yield mensaje;
            }
            case 33 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(treinta).append(tres).toString().toUpperCase() 
                                                                    : concatenador.append(treinta).append(tres).toString().toLowerCase();
                yield mensaje;
            }
            case 34 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(treinta).append(cuatro).toString().toUpperCase() 
                                                                    : concatenador.append(treinta).append(cuatro).toString().toLowerCase();
                yield mensaje;
            }
            case 35 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(treinta).append(cinco).toString().toUpperCase() 
                                                                    : concatenador.append(treinta).append(cinco).toString().toLowerCase();
                yield mensaje;
            }
            case 36 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(treinta).append(seis).toString().toUpperCase() 
                                                                    : concatenador.append(treinta).append(seis).toString().toLowerCase();
                yield mensaje;
            }
            case 37 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(treinta).append(siete).toString().toUpperCase() 
                                                                    : concatenador.append(treinta).append(siete).toString().toLowerCase();
                yield mensaje;
            }
            case 38 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(treinta).append(ocho).toString().toUpperCase() 
                                                                    : concatenador.append(treinta).append(ocho).toString().toLowerCase();
                yield mensaje;
            }
            case 39 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(treinta).append(nueve).toString().toUpperCase() 
                                                                    : concatenador.append(treinta).append(nueve).toString().toLowerCase();
                yield mensaje;
            }
            case 40 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(cuarenta).toString().toUpperCase() 
                                                                    : concatenador.append(cuarenta).toString().toLowerCase();
                yield mensaje;
            }
            case 41 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(cuarenta).append(uno).toString().toUpperCase() 
                                                                    : concatenador.append(cuarenta).append(uno).toString().toLowerCase();
                yield mensaje;
            }
            case 42 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(cuarenta).append(dos).toString().toUpperCase() 
                                                                    : concatenador.append(cuarenta).append(dos).toString().toLowerCase();
                yield mensaje;
            }
            case 43 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(cuarenta).append(tres).toString().toUpperCase() 
                                                                    : concatenador.append(cuarenta).append(tres).toString().toLowerCase();
                yield mensaje;
            }
            case 44 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(cuarenta).append(cuatro).toString().toUpperCase() 
                                                                    : concatenador.append(cuarenta).append(cuatro).toString().toLowerCase();
                yield mensaje;
            }
            case 45 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(cuarenta).append(cinco).toString().toUpperCase() 
                                                                    : concatenador.append(cuarenta).append(cinco).toString().toLowerCase();
                yield mensaje;
            }
            case 46 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(cuarenta).append(seis).toString().toUpperCase() 
                                                                    : concatenador.append(cuarenta).append(seis).toString().toLowerCase();
                yield mensaje;
            }
            case 47 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(cuarenta).append(siete).toString().toUpperCase() 
                                                                    : concatenador.append(cuarenta).append(siete).toString().toLowerCase();
                yield mensaje;
            }
            case 48 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(cuarenta).append(ocho).toString().toUpperCase() 
                                                                    : concatenador.append(cuarenta).append(ocho).toString().toLowerCase();
                yield mensaje;
            }
            case 49 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(cuarenta).append(nueve).toString().toUpperCase() 
                                                                    : concatenador.append(cuarenta).append(nueve).toString().toLowerCase();
                yield mensaje;
            }
            case 50 -> {
                System.out.printf("Desea imprimir en Mayuscula Si/No: ");
                String respuesta = teclado.next();
                String mensaje = (respuesta.equalsIgnoreCase("si")) ? concatenador.append(cincuenta).toString().toUpperCase() 
                                                                    : concatenador.append(cincuenta).toString().toLowerCase();
                yield mensaje;
            }
            
            default -> "Numero inexistente";
        }; 
        System.out.println(resultado);
    }
    
}
