public class Main {
    public static void main(String[] args) {


        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471, 9, 12345);
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", 863, 10, 67890);
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471, 9, 12345);


        System.out.println("Información del libro 1:");
        libro1.mostarInfo();

        System.out.println("\nInformación del libro 2:");
        libro2.mostarInfo();


        System.out.println("\n¿El libro 1 es igual al libro 2? " + libro1.equals(libro2));
        System.out.println("¿El libro 1 es igual al libro 3? " + libro1.equals(libro3));


        System.out.println("\nUsando toString():");
        System.out.println(libro1);


        libro2.setValoracion(8);
        libro2.setNumpaginas(900);

        System.out.println("\nLibro 2 después de modificar datos:");
        libro2.mostarInfo();
    }
}
