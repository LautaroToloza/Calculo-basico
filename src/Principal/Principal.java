package Principal;

/**
 * @author Lautaro Toloza
 */
public class Principal {
    /* Ejercicio:
       Dado dos identificadores A y B de tipo entero.
       Los valores iniciales serán 25 y 100 deberá mostrar
       por pantalla las siguientes operaciones aritméticas
       suma, resta, multiplicación, división y resto.
    */

    public static void main(String[] args) {
        // Variables
        
        int a = 25;
        int b = 100;

        // Operaciones Aritméticas
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = b / a;
        int resto = b % a;

        // Resultados 
        System.out.println("Resultados...");
        System.out.println("-------------------------");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Resto: " + resto);
        System.out.println("-------------------------");


        
        
    }
    
}
