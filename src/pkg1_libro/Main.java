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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libro1 = null;
        Libro libro2 = null;
        try {
            libro1 = new Libro(1234567890, "La sombre del viento", "Carlos ruiz zafon", 125);
            libro2 = new Libro(0111434112, "El señor de los anillos", "J.F Tolkien", 453);
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        
        System.out.println(libro1);
        System.out.println(libro2);
        
        if(libro1.getNumeroPaginas()> libro2.getNumeroPaginas()){
            System.out.println("El libro " + libro1.getTitulo() + " tiene mas numero de paginas\n");
        }else{
            System.out.println("El libro " + libro2.getTitulo() + " tiene mas numero de paginas\n");
        }
        
        
    }
    
}
