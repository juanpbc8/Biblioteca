package Codigos;
public class Libro {
    private static int contadorLibros = 0;
    private int idLibro;
    private int añoPublicacion;
    private String titulo;
    private String autor;
    private String ISBN;
    private String editorial;
    private int copias;
    
    public Libro(int añoPublicacion, String titulo, String autor, String ISBN, String editorial,int copias) {
        this.idLibro = contadorLibros+1;
        this.añoPublicacion = añoPublicacion;
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.copias = copias;
        contadorLibros++;
    }

    public static int getContadorLibros() {
        return contadorLibros;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getCopias() {
        return copias;
    }
    
    
}
