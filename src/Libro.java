public class Libro {

    //Construccion de parametros
    private String Libro;
    private String Autor;
    private int cantidadDisponible;
    private boolean disponibilidad;

    // constructor Vacio
    public Libro() {
    }

    //constructor completo
    public Libro(String libro, String autor, int cantidadDisponible, boolean disponibilidad) {
        this.Libro = libro;
        this.Autor = autor;
        this.cantidadDisponible = cantidadDisponible;
        this.disponibilidad = disponibilidad;
    }

    //Getters - Setters
    public String getLibro() {
        return Libro;
    }

    public void setLibro(String libro) {
        Libro = libro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    //To string
    @Override
    public String toString() {
        return "Libro{" +
                "Libro='" + Libro + '\'' +
                ", Autor='" + Autor + '\'' +
                ", cantidadDisponible=" + cantidadDisponible +
                ", disponibilidad=" + disponibilidad +
                '}';
    }

    //Metodos
    public void mostrarInformacion (){
        System.out.println("Titulo: " + this.getLibro());
        System.out.println("Autor: "  + this,getAutor());
        System.out.println("Cantidad Disponible: " + this.getCantidadDisponible());
    }



}
