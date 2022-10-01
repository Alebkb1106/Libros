
package libros;

import java.util.Objects;


public class Autor {
    
    private String nombre;
    private int edad;
    private Genero GENERO;

    public Autor(String nombre, int edad, Genero genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.GENERO=genero;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", edad=" + edad + ", GENERO=" + GENERO + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.GENERO != other.GENERO) {
            return false;
        }
        return true;
    }
    
    

    public Genero getGENERO() {
        return GENERO;
    }

    public void setGENERO(Genero GENERO) {
        this.GENERO = GENERO;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
            
    
}
