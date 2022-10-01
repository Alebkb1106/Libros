
package libros;

import java.util.List;

/**
 *
 * @author Alejandro
 */
public class Libro {

    private String Titulo;
private List<Autor> autores;
private String edicion;
private String isbn;

    public Libro(String Titulo, List<Autor> autores, String edicion, String isbn) {
        this.Titulo = Titulo;
        this.autores = autores;
        this.edicion = edicion;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    
}
