
public class Libreria {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(100); // Capacidad máxima de 100 libros
        Scanner scanner = new Scanner(System.in);

        // Añadir algunos libros iniciales
        biblioteca.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", 1605, "Novela"));
        biblioteca.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 1967, "Novela"));
        biblioteca.agregarLibro(new Libro("La Odisea", "Homero", -800, "Epopeya"));

        // Interactuar con el usuario para realizar operaciones
        while (true) {
            System.out.println("\nMenú de la Biblioteca:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Prestar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Mostrar libros disponibles");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea
                    System.out.print("Ingrese el género: ");
                    String genero = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor, ano, genero));
                    break;
                case 2:
                    System.out.print("Ingrese el título: ");
                    titulo = scanner.nextLine();
                    biblioteca.buscarPorTitulo(titulo);
                    break;
                case 3:
                    System.out.print("Ingrese el autor: ");
                    autor = scanner.nextLine();
                    biblioteca.buscarPorAutor(autor);
                    break;
                case 4:
                    System.out.print("Ingrese el título del libro a prestar: ");
                    titulo = scanner.nextLine();
                    biblioteca.prestarLibro(titulo);
                    break;
                case 5:
                    System.out.print("Ingrese el título del libro a devolver: ");
                    titulo = scanner.nextLine();
                    biblioteca.devolverLibro(titulo);
                    break;
                case 6:
                    biblioteca.mostrarLibrosDisponibles();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
