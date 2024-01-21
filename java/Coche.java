public class Coche {
    //Atributos
    String color;
    String marca;
    String modelo;
    String cilindrada;

    //Metodo
    public static void acelerar() {
        System.out.println("Estoy acelerando");
    }
    
    public static void frenar() {
        System.out.println("Estoy frenando");
    }
    
    public static void arrancar() {
        System.out.println("Estoy arrancando");
    }
    
    public static void main(String [] args) {
    	Coche coche1 = new Coche();
   	 
    	coche1.color = "Blanco";
    	coche1.marca = "Audi";
    	coche1.modelo = "A3";
        coche1.cilindrada = "4000cc";
   	 
    	System.out.println("El color del coche es: "+coche1.color);
    	System.out.println("La marca del coche es: "+coche1.marca);
    	System.out.println("El kilometraje del coche es: "+coche1.modelo);
        System.out.println("Las cilindradas del coche es de: "+coche1.cilindrada);
   	 
    }
}
