import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private int numpaginas;
    private int valoracion;
    private int isbn;

    public Libro(String titulo, String autor, int numpaginas, int valoracion, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.numpaginas = numpaginas;
        this.valoracion = valoracion;
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    void mostarInfo(){
        System.out.println("Titulo = " + titulo);
        System.out.println("Autor = " + autor);
        System.out.println("ISBN = " + isbn);
        System.out.println("NumPaginas = " + numpaginas);
        System.out.println("Valoración = " + valoracion);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numpaginas=" + numpaginas +
                ", valoracion=" + valoracion +
                ", isbn=" + isbn +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }
}