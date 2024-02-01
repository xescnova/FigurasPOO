import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<Figura>();

        figuras.add(new Triangulo());
        figuras.add(new Rectangulo());
        figuras.add(new Triangulo());
        figuras.add(new Rectangulo());
        figuras.add(new Rombo());

        System.out.println("Figuras de tipo Cuadrado:");
        for (Figura figura : figuras) {
            if (figura instanceof Cuadrado) {
                figura.pintar();
            }
        }
        System.out.println("\nFiguras de tipo Triangulo:");
        for (Figura figura : figuras) {
            if (figura instanceof Triangulo) {
                figura.pintar();
            }
        }
    }
}
