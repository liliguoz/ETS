import javax.swing.JOptionPane;

public class TrianguloOperacion {
    // Atributo
    double base;
    double lado;
    double altura;

    public void calcularAreaYPerimetro() {
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triángulo: "));
        lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del lado del triángulo: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triángulo: "));

        double area = base * altura / 2;
        double perimetro = base + lado + lado;

        System.out.println("Área del triángulo: " + area);
        System.out.println("Perímetro del triángulo: " + perimetro);
    }

    public static void main(String[] args) {
        new TrianguloOperacion().calcularAreaYPerimetro();
    }
}