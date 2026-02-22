public class Main {
    public static void main(String[] args) {
    Libro e1 = new Libro("Cien años de soledad" , "Gabriel Garcia Marquez",16, true );


    e1.mostrarInformacion();


    Libro e2 = new Libro();
    e2.nombre("El amor en tiempos del colera");
    e2.escritor("GABO");
    e2.copias(30, 15);
    e2.estaDisp();








    }
}