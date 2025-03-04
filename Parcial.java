import java.util.Scanner;

public class Parcial {
    static public Scanner sc = new Scanner(System.in);
    String titulo, autor;
    int numEjemplares, numEjemPrest;

    public Parcial(String titulo, String autor, int numEjemplares, int numEjemPrest) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemPrest = numEjemPrest;
    }

    public Parcial() {

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

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemPrest() {
        return numEjemPrest;
    }

    public void setNumEjemPrest(int numEjemPrest) {
        this.numEjemPrest = numEjemPrest;
    }

    public boolean prestamo() {
        if(numEjemPrest<numEjemplares) {
            numEjemPrest = numEjemPrest + 1;
            return true;
        }else {
            return false;
        }
    }

    public boolean devolver() {
        if(numEjemPrest > 0) {
            numEjemPrest = numEjemPrest - 1;
            return true;
        }else {
            return false;
        }
    }

    public void imprimir() {
        System.out.println("El titulo del libro que elegiste es: "+ titulo + "\n El autor al que le pertenece el libro es: "+ autor +"\n tiene "+numEjemplares+" ejemplares y actualmente hay "+numEjemPrest+" prestados");
    }

    public static void main(String[] args) {
        Parcial libro1 = new Parcial("Libro de las maravillas del mundo", "Sebastian Franco", 4, 1);
        libro1.imprimir();

        Parcial libro2 = new Parcial(); 

        System.out.println("Ingresame el titulo del libro");
        libro2.setTitulo(sc.nextLine());


        System.out.println("Ingresame el nombre del autor del libro");
        libro2.setAutor(sc.nextLine());

        System.out.println("Ingresame la cantidad de ejemplares que hay del libro");
        libro2.setNumEjemplares(sc.nextInt());

        System.out.println("Ingresame la cantidad de libros prestados");
        libro2.setNumEjemPrest(sc.nextInt());
    }
}