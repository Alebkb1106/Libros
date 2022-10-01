
package libros;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;


public class Libreria {
    private List<Libro> libros;
private String nombre;

public Libreria(String nombre){
libros=new ArrayList<>();
this.nombre=nombre;
}

public boolean agregarLibro(Libro l){
libros.add(l);
return true;
}

public List<Autor> getAutoresMujeres(Genero genero){
    return libros.stream()
            .map(libro -> libro.getAutores())
            .flatMap(autores -> autores.stream())
            .filter(autor -> autor.getGENERO() == genero)
            .distinct()
            .collect(Collectors.toList());
            
}
        
   public int obtenerSumaDeEdadesAutores(){
       return libros.stream()
               .map(Libro::getAutores)
               .flatMap(List<Autor>::stream)
               .peek(autor -> System.out.println("salida del flatmap:"+autor))
               .distinct()
               .peek(autor -> System.out.println("salida del distinct:"+autor))
               .map(Autor::getEdad)
               .reduce(0, (base, edad) -> base+edad);
   }     
   
//   public int obtenerSumaDeEdadesAutores(){
//       return libros.stream()
//               .map(Libro::getAutores)
//               .flatMap(List<Autor>::stream)
//               .distinct()
//               .map(Autor::getEdad)
//               .sum();
//   }     
   
   public void imprimirLibros() {
        libros.stream()
            .map(libro -> libro.getTitulo())
            .distinct()
            .forEach(System.out::print); //titulo -> System.out.println(titulo)
    }
   
   public List<String> getTitulosDisponibles(){
       return libros.stream()
               .map(Libro::getTitulo)
               .distinct()
               .collect(Collectors.toList());
   }
   
   public List<Autor> getAutores(Genero genero){
       return libros.stream()
               .map(libro -> libro.getAutores())
               .flatMap(autores -> autores.stream())
               .filter(autor -> autor.getGENERO()== genero)
               .distinct()
               .collect(Collectors.toList());
   }
   
   public Map<Genero, List<Autor>> obtenerAutoresAgrupadosPorGenero(){
        return libros.parallelStream()
                .map(Libro::getAutores)
                .flatMap(autores -> autores.parallelStream())
                .collect(groupingBy(Autor::getGENERO));
}
    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
