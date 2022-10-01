
package libros;

import java.util.ArrayList;
import java.util.stream.IntStream;


public class Libros {
    public static void main(String[] args) {
        Libreria libreria=new Libreria("ocho libros");
        
        ArrayList<Autor> autores= new ArrayList<>();
        autores.add(new Autor("craig Larman", 70, Genero.HOMBRE));
        Libro libro= new Libro("UML  y patrones", autores, "7ma", "1234567890");
        libreria.agregarLibro(libro);
        
        autores= new ArrayList<>();
        autores.add(new Autor("Roger S.Pressman", 60, Genero.HOMBRE));
        libro= new Libro("Ingenieria de software, un enfoque aplicado", autores, "10ma", "1234567890");
        libreria.agregarLibro(libro);
        
        autores= new ArrayList<>();
        autores.add(new Autor("Deitel", 50, Genero.HOMBRE));
        libro= new Libro("Como programar en java", autores, "12va", "34567788965");
        libreria.agregarLibro(libro);
        
        autores= new ArrayList<>();
        autores.add(new Autor("Ann Druyan", 73, Genero.MUJER));
        libro= new Libro("nose", autores, "12va", "34567788965");
        libreria.agregarLibro(libro);
        
        autores= new ArrayList<>();
        autores.add(new Autor("Jane Austen", 73, Genero.MUJER));
        libro= new Libro("Orgullo y prejuicio", autores, "1ra", "34567788965");
        libreria.agregarLibro(libro);
        
        //List<String> nombresDeLibros= libreria.gett
        System.out.println(libreria.obtenerAutoresAgrupadosPorGenero());
        
        int suma= IntStream.range(0, 1000)
        .sum();
        
        System.out.println(suma);
        
//        IntStream.iterate(0, valor ->valor+1) 
//                .forEach(valor ->  System.out.println(valor));
        
        System.out.println(IntStream.range(0, 1000).summaryStatistics());
        
        System.out.println(libreria.obtenerSumaDeEdadesAutores());
        
        System.out.println(libreria.getTitulosDisponibles());
        
        System.out.println(libreria.getAutores(Genero.MUJER));
    }
 
}
