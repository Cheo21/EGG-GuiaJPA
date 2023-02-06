package Entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "libro")
public class Libro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "isbn")
    private long isbn;
    
    @Column(name = "titulo")
    private String titulo;
    
    @Column(name = "anio")
    private int anio;

    @Column(name = "ejemplares")
    private int ejemplares;
    
    @Column(name = "ejemplares_prestados")
    private int ejemplaresPrestados;
    
    @Column(name = "ejemplares_restantes")
    private int ejemplaresRestantes;
    
    @Column(name = "alta")
    private boolean alta;
    
    @OneToOne
    private Autor autor;
    
    @OneToOne
    private Editorial editorial;
  
    //funciones

    public Libro() {
    }

    public long getIsbn() {
        return isbn;
    }

    private void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public int getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(int ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{"
                + "isbn=" + isbn
                + ", titulo='" + titulo + '\''
                + ", anio=" + anio
                + ", ejemplares=" + ejemplares
                + ", ejemplaresPrestados=" + ejemplaresPrestados
                + ", ejemplaresRestantes=" + ejemplaresRestantes
                + ", alta=" + alta
                + ", autor=" + autor
                + ", editorial=" + editorial
                + '}';
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
        final Libro other = (Libro) obj;
        if (this.isbn != other.isbn) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        if (this.ejemplares != other.ejemplares) {
            return false;
        }
        if (this.ejemplaresPrestados != other.ejemplaresPrestados) {
            return false;
        }
        if (this.ejemplaresRestantes != other.ejemplaresRestantes) {
            return false;
        }
        if (this.alta != other.alta) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.editorial, other.editorial)) {
            return false;
        }
        return true;
    }

}
