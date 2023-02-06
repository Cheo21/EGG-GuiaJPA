package Main;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Servicios.AutorService;
import Servicios.EditorialService;
import Servicios.LibroService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jg211
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LibroService ls = new LibroService();
        AutorService as = new AutorService();
        EditorialService es = new EditorialService();

        //Autor 1
        Autor autor1 = new Autor();
        autor1.setAlta(true);
        autor1.setNombre("Pepe");

        //Autor 2
        Autor autor2 = new Autor();
        autor2.setAlta(true);
        autor2.setNombre("Elpeepito");

        //Guardado autores
        as.guardarAutor(autor1);
        as.guardarAutor(autor2);

        //Editorial 1
        Editorial edit1 = new Editorial();
        edit1.setAlta(true);
        edit1.setNombre("Editorial el Pepe");

        //Editorial 2
        Editorial edit2 = new Editorial();
        edit2.setAlta(true);
        edit2.setNombre("Editorial elpepito");

        //Guardado editoriales
        es.guardarEditorial(edit1);
        es.guardarEditorial(edit2);

        //Libro 1
        Libro libro1 = new Libro();
        libro1.setAlta(true);
        libro1.setAnio(2000);
        libro1.setEditorial(edit1);
        libro1.setAutor(autor1);
        libro1.setTitulo("La historia de pepe");
        libro1.setEjemplares(5);
        libro1.setEjemplaresPrestados(1);
        libro1.setEjemplaresRestantes(4);

        //Libro 2
        Libro libro2 = new Libro();
        libro2.setAlta(true);
        libro2.setAnio(2001);
        libro2.setEditorial(edit1);
        libro2.setAutor(autor1);
        libro2.setTitulo("La historia de pepe mas pepe que nunca");
        libro2.setEjemplares(500);
        libro2.setEjemplaresPrestados(1);
        libro2.setEjemplaresRestantes(499);

//            Libro libro3 = new Libro();
//            libro3.setAlta(true);
//            libro3.setAnio(2003);
//            libro3.setEditorial(edit1);
//            libro3.setAutor(autor1);
//            libro3.setTitulo("La historia de pepe la revancha de pepito");
//            libro3.setEjemplares(5000);
//            libro3.setEjemplaresPrestados(1);
//            libro3.setEjemplaresRestantes(4999);
        ls.guardar(libro1);
        ls.guardar(libro2);

        /**
         * ls.buscarLibrosPorEditorial("Editorial el Pepe").forEach((libro) -> {
         * System.out.println(libro); });
         */
    }

}
