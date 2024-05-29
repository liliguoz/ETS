import javax.swing.JOptionPane;

public class CuadradoOperacion {
    // Atributo
    double lado;

    public void calcularAreaYPerimetro() {
        lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del lado del cuadrado: "));

        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }

    public static void main(String[] args) {
        new CuadradoOperacion().calcularAreaYPerimetro();
    }
}