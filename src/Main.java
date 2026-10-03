public class Main {
    public static void main(String[] args) {
        // Lista de libros
        SinglyLinkedList<Book> books = new SinglyLinkedList<>();
        books.insertLast(new Book("Clean Code", "Robert C. Martin"));
        books.insertLast(new Book("Effective Java", "Joshua Bloch"));
        books.insertFirst(new Book("Refactoring", "Martin Fowler"));
        books.traverse();
        System.out.println("Existe Clean Code: " + books.contains(new Book("Clean Code", "Robert C. Martin")));
        books.remove(new Book("Clean Code", "Robert C. Martin"));
        books.traverse();


        // Creación una lista de strings
        SinglyLinkedList<String> stringprograma = new SinglyLinkedList<>();

        // Añadan 3 strings
        stringprograma.insertFirst("Java");
        stringprograma.insertLast("Python");
        stringprograma.insertLast("C++");

        // Muestren los 3 strings
        System.out.println("--- Programas ---");
        stringprograma.traverse();

        // Borren uno
        stringprograma.remove("Python");

        // Volvamos a mostrar
        System.out.println("--- Actualizado ---");
        stringprograma.traverse();

    }
}
