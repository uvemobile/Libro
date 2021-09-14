/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_libro;

/**
 *
 * @author uvemo
 */
public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    //metodos setter
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    
    //Metodos getter
    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    
  

    
    @Override
    public String toString() {
        return "El Libro con el titulo: " + titulo + ",\n con el ISBN: " + ISBN +",\n creado por el autor: " + autor + ",\n tiene un numero de Paginas de: " + numeroPaginas + "\n";
    }
    
    
    
    
    
    
}
