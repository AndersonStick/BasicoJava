import java.util.Scanner;
import java.util.Set;

public class App {

    private String obtenerAltura(int altura){

        String resultado = "";

        if (altura >= 172) {
            resultado = "Eres una persona alta para Colombia, mides " + altura;
        } else {
            resultado = "Eres una persona bajita en Colombia.";
        }

        return resultado;
    }

    public static void main(String[] args) throws Exception {

        // System: 
        System.out.println("Repasando Java");
        System.out.println("Soy Anderson Barrera");
        /* Comentario
         * de varias lineas 
         * de codigo
         */

        // Variables
        int edad = 20;
        String nombre = "Anderson";
        boolean mayorDeEdad = true;
        byte indice;

        // Concatenación
        System.out.println("Mi nombre es " + nombre + " tengo " + edad + " anios.");
        // System.out.printf("Me llamo %s tengo %d años", nombre, edad);

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        // System.out.println("Como te llamas?: ");
        // String miNombre = sc.nextLine();
    
        // System.out.println("El usuario se llama " + miNombre);

        // Condiciones
        System.out.println("Cuantos anios tienes?");
        int edadUsuario = 18;

        if (edadUsuario >= 18) {
            System.out.println("Eres mayor de edad con: " + edadUsuario + " anios.");
        } else {
            System.out.println("No eres mayor de edad.");
        }

        System.out.println("Cuanto mides?");
        int altura = sc.nextInt();

        App aplicacion = new App();
        System.out.println(aplicacion.obtenerAltura(altura));

        // Array
        String[] personas = {"Victor", "Pedro", "Juan"};

        System.out.println(personas[1]);
         
        // Bucle for

        for(String persona : personas){
            System.out.println("- " + persona);
        }
    }
}
