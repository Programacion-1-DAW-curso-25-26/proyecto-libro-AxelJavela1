import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Libro> listaLibros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Buscar libro por ISBN");
            System.out.println("4. Eliminar libro por ISBN");
            System.out.println("5. Vaciar lista");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> añadirLibro();
                case 2 -> mostrarLibros();
                case 3 -> buscarPorIsbn();
                case 4 -> eliminarPorIsbn();
                case 5 -> vaciarLista();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
            }

        } while (opcion != 0);
    }


    static void añadirLibro() {
        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Número de páginas: ");
        int numPaginas = sc.nextInt();

        System.out.print("Valoración: ");
        int valoracion = sc.nextInt();

        System.out.print("ISBN: ");
        int isbn = sc.nextInt();

        Libro libro = new Libro(titulo, autor, numPaginas, valoracion, isbn);

        if (!listaLibros.contains(libro)) {
            listaLibros.add(libro);
            System.out.println("Libro añadido correctamente.");
        } else {
            System.out.println("Ya existe un libro con ese ISBN.");
        }
    }


    static void mostrarLibros() {
        if (listaLibros.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (Libro libro : listaLibros) {
                libro.mostarInfo();
                System.out.println("-------------------");
            }
        }
    }


    static void buscarPorIsbn() {
        System.out.print("Introduce el ISBN: ");
        int isbn = sc.nextInt();

        for (Libro libro : listaLibros) {
            if (libro.getIsbn() == isbn) {
                libro.mostarInfo();
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }


    static void eliminarPorIsbn() {
        System.out.print("Introduce el ISBN: ");
        int isbn = sc.nextInt();

        Libro libroAEliminar = null;

        for (Libro libro : listaLibros) {
            if (libro.getIsbn() == isbn) {
                libroAEliminar = libro;
                break;
            }
        }

        if (libroAEliminar != null) {
            listaLibros.remove(libroAEliminar);
            System.out.println("Libro eliminado.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }


    static void vaciarLista() {
        listaLibros.clear();
        System.out.println("Lista vaciada correctamente.");
    }
}
