import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);


    Libro e1 = new Libro("Cien años de soledad" , "Gabriel Garcia Marquez",16, true );


    e1.mostrarInformacion();


    Libro e2 = new Libro();
    e2.nombre("El amor en tiempos del colera");
    e2.escritor("GABO");
    e2.copias(30, 30);
    System.out.println("Disponibilidad: " + e2.Disponibilidad());

    Libro e3 = new Libro();

        System.out.println("Ingrese el titulo del libro");
        e3.setLibro(teclado.nextLine());
        System.out.println("Ingrese el autor del libro");
        e3.setAutor(teclado.nextLine());
        System.out.println("Ingrese las copias del libro");
        e3.setCantidadDisponible(teclado.nextInt());
        System.out.println("¿El libro esta disponible?");
        e3.setDisponibilidad(teclado.nextBoolean());


        System.out.println(e3.toString());

    }
}