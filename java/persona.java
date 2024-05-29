package com.mycompany.ets;

/**
 *
 * @author User
 */
public class persona {
    //Atributos
    String nombre;
    String apellido;
    Integer edad;
    Double altura;
    Double peso;

    //Metodo
    public static void caminar() {
        System.out.println("Estoy caminando");
    }
    
    public static void hablar() {
        System.out.println("Estoy hablando");
    }
    
    public static void nacer() {
        System.out.println("Estoy naciendo");
    }
    
    public static void morir() {
        System.out.println("Estoy muriendo");
    }
    
    public static void main(String [] args) {
    	persona persona1 = new persona();
   	 
    	persona1.nombre = "Manuel";
        persona1.apellido = "Rodríguez";
        persona1.edad = 23;
        persona1.altura = 1.80;
        persona1.peso = 75.5;
   	 
    	System.out.println("El nombre es: "+persona1.nombre);
    	System.out.println("El apellido es: "+persona1.apellido);
    	System.out.println("La edad es: "+persona1.edad);
        System.out.println("Su altura es: "+persona1.altura);
        System.out.println("Su peso es: "+persona1.peso);
    }
}
