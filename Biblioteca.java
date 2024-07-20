class Biblioteca {
    private Libro[] libros;
    private int contador;

    public Biblioteca(int capacidad) {
        libros = new Libro[capacidad];
        contador = 0;
    }

    public void agregarLibro(Libro libro) {
        if (contador < libros.length) {
            libros[contador] = libro;
            contador++;
            System.out.println("Libro agregado a la biblioteca.");
        } else {
            System.out.println("No hay espacio para agregar más libros.");
        }
    }

    public void buscarPorTitulo(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(libros[i]);
            }
        }
    }

    public void buscarPorAutor(String autor) {
        for (int i = 0; i < contador; i++) {
            if (libros[i].getAutor().equalsIgnoreCase(autor)) {
                System.out.println(libros[i]);
            }
        }
    }

    public void prestarLibro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                libros[i].prestar();
                return;
            }
        }
        System.out.println("El libro no se encuentra en la biblioteca.");
    }

    public void devolverLibro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                libros[i].devolver();
                return;
            }
        }
        System.out.println("El libro no se encuentra en la biblioteca.");
    }

    public void mostrarLibrosDisponibles() {
        for (int i = 0; i < contador; i++) {
            if (libros[i].isDisponible()) {
                System.out.println(libros[i]);
            }
        }
    }
}

